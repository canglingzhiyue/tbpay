package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes9.dex */
public class b {
    public static boolean a(ByteBuffer byteBuffer, d dVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        dVar.b();
        return false;
    }

    public static boolean a(ByteBuffer byteBuffer, d dVar, g gVar) throws IOException {
        byteBuffer.clear();
        int a2 = gVar.a(byteBuffer);
        byteBuffer.flip();
        if (a2 == -1) {
            dVar.b();
            return false;
        }
        return gVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(org.java_websocket.d r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.c
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L16
            boolean r0 = r5 instanceof org.java_websocket.g
            if (r0 == 0) goto L2f
            r0 = r5
            org.java_websocket.g r0 = (org.java_websocket.g) r0
            r0.a()
            goto L30
        L16:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L20
            return r1
        L20:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.c
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.c
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L16
        L2f:
            r0 = 0
        L30:
            if (r4 == 0) goto L65
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L65
            boolean r2 = r4.f()
            if (r2 == 0) goto L65
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            if (r2 == 0) goto L65
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            org.java_websocket.WebSocket$Role r2 = r2.d()
            if (r2 == 0) goto L65
            org.java_websocket.drafts.Draft r2 = r4.getDraft()
            org.java_websocket.WebSocket$Role r2 = r2.d()
            org.java_websocket.WebSocket$Role r3 = org.java_websocket.WebSocket.Role.SERVER
            if (r2 != r3) goto L65
            monitor-enter(r4)
            r4.a()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            goto L65
        L62:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            throw r5
        L65:
            if (r0 == 0) goto L71
            org.java_websocket.g r5 = (org.java_websocket.g) r5
            boolean r4 = r5.a()
            if (r4 != 0) goto L70
            goto L71
        L70:
            return r1
        L71:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.b.a(org.java_websocket.d, java.nio.channels.ByteChannel):boolean");
    }
}
