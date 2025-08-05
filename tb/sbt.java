package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket.c;
import org.java_websocket.d;
import org.java_websocket.drafts.Draft;
import org.java_websocket.f;

/* loaded from: classes9.dex */
public class sbt implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SocketChannel b(SocketChannel socketChannel, SelectionKey selectionKey) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SocketChannel) ipChange.ipc$dispatch("9898f59c", new Object[]{this, socketChannel, selectionKey}) : socketChannel;
    }

    @Override // org.java_websocket.f
    public /* synthetic */ ByteChannel a(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteChannel) ipChange.ipc$dispatch("f015ba12", new Object[]{this, socketChannel, selectionKey}) : b(socketChannel, selectionKey);
    }

    @Override // org.java_websocket.f
    public d a(c cVar, List<Draft> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f370d27c", new Object[]{this, cVar, list}) : new d(cVar, list);
    }
}
