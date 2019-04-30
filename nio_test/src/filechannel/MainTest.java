package filechannel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

/**
 * FileChannel测试类
 * @author Augue
 *
 */
public class MainTest {
	@Test
	public void test() throws IOException {
		RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
		FileChannel channel = file.getChannel();
		channel.position(channel.size()); // 将位置标记设置为文件末尾
		
		String newData = "balabala, balabala";
		ByteBuffer buffer = ByteBuffer.allocate(48);
		buffer.clear(); // 这里刚刚创建了buffer, clear的意义不明确
		buffer.put(newData.getBytes());
		
		buffer.flip();
		/*
		 * buffer.hasRemaining()方法是用来判断是否还有实际可读取的数据
		 * 翻译:表示当前位置和限制之间是否有任何元素。
		 */
		while(buffer.hasRemaining()) {
			channel.write(buffer);
		}
		
		channel.close();
		file.close();
	}
}
