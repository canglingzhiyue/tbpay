package com.taobao.global.setting;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.nyf;

/* loaded from: classes7.dex */
public class TBSettingServiceImpl implements Serializable, nyf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT = "default";
    private String bizCode = "default";

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    @Override // tb.nyf
    @Deprecated
    public boolean isAutoPlayVideoUnderWifi(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f309c796", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        c a2 = c.a(context, this.bizCode);
        return a2 == null ? z : a2.b().b(z);
    }

    @Deprecated
    public void setAutoPlayVideoUnderWifi(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b8caca", new Object[]{this, context, new Boolean(z)});
            return;
        }
        c a2 = c.a(context, this.bizCode);
        if (a2 == null) {
            return;
        }
        a2.c().a(z);
        a2.c().a(0);
    }

    public boolean isTaoPassWordCutOpen(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d6dff50", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        c a2 = c.a(context, this.bizCode);
        return a2 == null ? z : a2.b().c(z);
    }

    public int getVideoPlayNetworkType(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bfda2e4", new Object[]{this, context, new Integer(i)})).intValue();
        }
        c a2 = c.a(context, this.bizCode);
        return a2 == null ? i : a2.b().a(i);
    }

    public void setVideoPlayNetworkType(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabdf4fd", new Object[]{this, context, new Integer(i)});
            return;
        }
        c a2 = c.a(context, this.bizCode);
        if (a2 == null) {
            return;
        }
        a2.c().a(i);
    }

    @Override // tb.nyf
    public boolean isAutoPlayVideoUnderCurrentNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5748a6", new Object[]{this, context})).booleanValue();
        }
        c a2 = c.a(context, this.bizCode);
        if (a2 != null) {
            return a2.b().a(context);
        }
        return false;
    }
}
