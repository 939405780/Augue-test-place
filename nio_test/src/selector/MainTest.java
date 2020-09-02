package selector;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("d:/test.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(48);
        int bytesRead = channel.read(buffer);
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buffer.flip();
            /*
             * buffer.hasRemaining()�����������ж��Ƿ���ʵ�ʿɶ�ȡ������
             * ����:��ʾ��ǰλ�ú�����֮���Ƿ����κ�Ԫ�ء�
             */
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            bytesRead = channel.read(buffer);
        }
        // channel��ͨ��randomAccessFile�����ȡ��, ����ֻ��Ҫ�رմ˶���
        randomAccessFile.close();
    }

    //	int interestSet = SelectionKey.OP_ACCEPT | SelectionKey.OP_CONNECT;
    @Test
    public void test2() {
        int i = 1 | 4;
        System.out.println(i);
    }
}
