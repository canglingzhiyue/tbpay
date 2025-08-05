package com.taobao.monitor.impl.trace;

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.f;
import tb.mny;
import tb.mpi;

/* loaded from: classes.dex */
public class h extends com.taobao.monitor.impl.trace.a<a> implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void blockFps(int i);

        void frameDataPerSecond(String str, int i, int i2, int i3, int i4, int i5, int i6);

        void scrollHitchRate(int i);
    }

    public h() {
        com.taobao.monitor.impl.common.f.a().a(this);
    }

    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae237d2", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 120;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putString("dataType", str);
        b.putInt(SPManager.FPS_KEY, i);
        b.putInt("jankCount", i2);
        b.putInt("movieJankCount", i3);
        b.putInt("movieBigJankCount", i4);
        b.putInt("frozenFrameCount", i5);
        b.putInt("slowFrameCount", i6);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
        mpi.c("FPSDispatcher", "dataType=", str, "fps=", Integer.valueOf(i), "slowFrameCount=", Integer.valueOf(i6), "jankCount=", Integer.valueOf(i2), "movieJankCount=", Integer.valueOf(i3), "movieBigJankCount=", Integer.valueOf(i4), "frozenFrameCount=", Integer.valueOf(i5));
        if (Build.VERSION.SDK_INT < 16 || !mny.SCROLL_TYPE_FINGER.equals(str)) {
            return;
        }
        mpi.b("ScrollFPS", Integer.valueOf(i));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 121;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putInt(SPManager.FPS_KEY, i);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
        mpi.c("FPSDispatcher", "卡顿帧率(blockFps)为", Integer.valueOf(i));
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 122;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putInt("scrollHitchRate", i);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
        mpi.c("FPSDispatcher", "scrollHitchRate 为", Integer.valueOf(i));
    }

    @Override // com.taobao.monitor.impl.common.f.a
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{120, 121, 122};
    }

    @Override // com.taobao.monitor.impl.common.f.a
    public void a(int i, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ae696e", new Object[]{this, new Integer(i), message});
            return;
        }
        switch (i) {
            case 120:
                Bundle data = message.getData();
                if (data == null) {
                    return;
                }
                for (LISTENER listener : this.f18168a) {
                    listener.frameDataPerSecond(data.getString("dataType"), data.getInt(SPManager.FPS_KEY), data.getInt("jankCount"), data.getInt("movieJankCount"), data.getInt("movieBigJankCount"), data.getInt("frozenFrameCount"), data.getInt("slowFrameCount"));
                }
                com.taobao.monitor.impl.common.f.a().a(data);
                return;
            case 121:
                Bundle data2 = message.getData();
                if (data2 == null) {
                    return;
                }
                for (LISTENER listener2 : this.f18168a) {
                    listener2.blockFps(data2.getInt(SPManager.FPS_KEY));
                }
                com.taobao.monitor.impl.common.f.a().a(data2);
                return;
            case 122:
                Bundle data3 = message.getData();
                if (data3 == null) {
                    return;
                }
                for (LISTENER listener3 : this.f18168a) {
                    listener3.scrollHitchRate(data3.getInt("scrollHitchRate"));
                }
                return;
            default:
                return;
        }
    }
}
