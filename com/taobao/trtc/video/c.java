package com.taobao.trtc.video;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.IArtcExternalVideoRender;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class c implements IArtcExternalVideoRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IArtcExternalVideoRender.Observer f23211a;
    private VideoFrame e;
    private Handler g;
    private final Object b = new Object();
    private final Object c = new Object();
    private final Object d = new Object();
    private String f = null;
    private long h = 0;
    private int i = 0;

    static {
        kge.a(1263395094);
        kge.a(1238665198);
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560fb279", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    public void a(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505269c6", new Object[]{this, str, videoFrame});
            return;
        }
        synchronized (this.c) {
            if (this.g == null) {
                TrtcLog.a("TrtcExternalVideoRender", "Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.d) {
                if (this.e == null) {
                    z = false;
                }
                if (z) {
                    this.e.release();
                }
                this.f = str;
                this.e = videoFrame;
                this.e.retain();
                this.g.post(new Runnable() { // from class: com.taobao.trtc.video.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.a(c.this);
                        }
                    }
                });
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this.d) {
            if (this.e == null) {
                return;
            }
            VideoFrame videoFrame = this.e;
            this.e = null;
            String str = this.f;
            synchronized (this.b) {
                if (this.f23211a != null) {
                    IArtcExternalVideoRender.Frame frame = new IArtcExternalVideoRender.Frame();
                    VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                    frame.dataY = i420.getDataY();
                    frame.dataU = i420.getDataU();
                    frame.dataV = i420.getDataV();
                    frame.strideY = i420.getStrideY();
                    frame.strideU = i420.getStrideU();
                    frame.strideV = i420.getStrideV();
                    frame.width = i420.getWidth();
                    frame.height = i420.getHeight();
                    frame.rotation = videoFrame.getRotation();
                    frame.timestampNs = videoFrame.getTimestampNs();
                    if (str == null) {
                        this.f23211a.onFrame(frame);
                    } else {
                        this.f23211a.onFrame(str, frame);
                    }
                    i420.release();
                    videoFrame.release();
                }
            }
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoRender
    public void setObserver(IArtcExternalVideoRender.Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6affd6", new Object[]{this, observer});
            return;
        }
        synchronized (this.b) {
            this.f23211a = observer;
        }
        TrtcLog.d("TrtcExternalVideoRender", "setObserver:" + observer);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.a("TrtcExternalVideoRender", "init");
        synchronized (this.c) {
            if (this.g == null) {
                HandlerThread handlerThread = new HandlerThread("ExternalVideoRenderer");
                handlerThread.start();
                this.g = new Handler(handlerThread.getLooper());
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcLog.a("TrtcExternalVideoRender", "release");
        synchronized (this.c) {
            if (this.g != null) {
                this.g.getLooper().quit();
                this.g = null;
            }
        }
    }
}
