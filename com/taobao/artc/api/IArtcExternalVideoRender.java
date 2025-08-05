package com.taobao.artc.api;

import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes6.dex */
public interface IArtcExternalVideoRender {

    /* loaded from: classes6.dex */
    public static class Frame {
        public ByteBuffer dataU;
        public ByteBuffer dataV;
        public ByteBuffer dataY;
        public int height;
        public int rotation;
        public int strideU;
        public int strideV;
        public int strideY;
        public long timestampNs;
        public int width;

        static {
            kge.a(1939639575);
        }
    }

    /* loaded from: classes6.dex */
    public interface Observer {
        void onFrame(Frame frame);

        void onFrame(String str, Frame frame);
    }

    void setObserver(Observer observer);
}
