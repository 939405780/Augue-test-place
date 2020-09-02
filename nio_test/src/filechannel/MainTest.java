package filechannel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

/**
 * FileChannel������
 *
 * @author Augue
 */
public class MainTest {
    @Test
    public void test() throws IOException {
        RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
        FileChannel channel = file.getChannel();
        channel.position(channel.size()); // ��λ�ñ������Ϊ�ļ�ĩβ

        String newData = "balabala, balabala";
        ByteBuffer buffer = ByteBuffer.allocate(48);
        buffer.clear(); // ����ոմ�����buffer, clear�����岻��ȷ
        buffer.put(newData.getBytes());

        buffer.flip();
        /*
         * buffer.hasRemaining()�����������ж��Ƿ���ʵ�ʿɶ�ȡ������
         * ����:��ʾ��ǰλ�ú�����֮���Ƿ����κ�Ԫ�ء�
         */
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }

        channel.close();
        file.close();
    }
}
