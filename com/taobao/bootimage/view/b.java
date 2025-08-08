package com.taobao.bootimage.view;

import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.kej;
import tb.kem;
import tb.keo;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f16713a;
    public long b;

    static {
        kge.a(-118623993);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915245) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.b());
        }
    }

    public b(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        this.b = 0L;
    }

    @Override // com.taobao.bootimage.view.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f != null) {
            this.f.removeMessages(11);
            this.f.removeMessages(10);
        }
        this.b = 0L;
        super.a();
    }

    @Override // com.taobao.bootimage.view.c
    public boolean b() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.h != null && (textView = this.f16713a) != null) {
            textView.setText(Long.toString(this.h.waitTime));
        }
        return super.b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = this.h.waitTime;
        if (this.b > 0) {
            this.f.sendEmptyMessageDelayed(11, 1000L);
        } else {
            kej.a(kem.TAG, "show base: wait time is zero");
        }
    }

    @Override // com.taobao.bootimage.view.c, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 10) {
            kej.a(kem.TAG, "show base: msg close");
            if (this.e) {
                if (this.d != null) {
                    this.d.a("other");
                }
                a();
            }
        } else if (i == 11) {
            kej.a(kem.TAG, "show base: count down update");
            if (!this.e) {
                return true;
            }
            long j = this.b;
            if (j < 2) {
                kej.a(kem.TAG, "show base: count down is finish:" + System.currentTimeMillis());
                if (this.d != null) {
                    this.d.a("other");
                }
                a();
            } else {
                this.b = j - 1;
                TextView textView = this.f16713a;
                if (textView != null) {
                    textView.setText(Long.toString(this.b));
                }
                if (this.f != null) {
                    this.f.sendEmptyMessageDelayed(11, 1000L);
                }
            }
        }
        return true;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        String str3 = StringUtils.isEmpty(this.h.sceneType) ? "" : this.h.sceneType;
        String str4 = StringUtils.isEmpty(this.h.bizType) ? "" : this.h.bizType;
        kej.a("BootImageAbstractBaseController", "commitPlayVideoMonitor sceneType: " + str3 + " ,bizType: " + str4);
        com.taobao.bootimage.linked.h.a("").h().a(str3, keo.i(), str, str4, str2, null);
    }
}
