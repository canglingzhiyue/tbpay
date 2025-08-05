package com.taobao.android.change.app.icon.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.android.change.app.icon.utils.e;
import com.taobao.android.change.app.icon.utils.f;
import com.taobao.android.change.app.icon.utils.g;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.igb;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHANGEICON_RESULT_CHECK = 1;

    /* renamed from: a */
    private Application f9320a;
    private ComponentName b;
    private AppIconComponentName c;
    private igb d;
    private long e;
    private float f;
    private long g;
    private long h;

    static {
        kge.a(-14987827);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$e5n207C9JBfmoOOt2TNKdBpievU(c cVar, float f) {
        cVar.a(f);
    }

    /* renamed from: lambda$r0yKmwEdD-dEYzerEiulrLWqzeU */
    public static /* synthetic */ void m838lambda$r0yKmwEdDdEYzerEiulrLWqzeU(c cVar, Bundle bundle) {
        cVar.a(bundle);
    }

    public c(Looper looper) {
        super(looper);
        this.e = 0L;
        this.f = 0.0f;
        this.g = 0L;
        this.h = 0L;
        this.f9320a = igc.b();
    }

    public void a(AppIconComponentName appIconComponentName, igb igbVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717549d5", new Object[]{this, appIconComponentName, igbVar, new Long(j), new Long(j2)});
            return;
        }
        AdapterForTLog.loge("ChangeAppIconHandler", "startCheck:" + appIconComponentName.toString() + " checkTotalTimeMs:" + j + " checkIntervalTimeMs:" + j2);
        this.c = appIconComponentName;
        this.b = new ComponentName(this.f9320a, appIconComponentName.clzPath);
        this.d = igbVar;
        this.f = 0.0f;
        this.g = j;
        this.h = j2;
        sendEmptyMessageDelayed(1, 300L);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        try {
            super.handleMessage(message);
            AdapterForTLog.loge("ChangeAppIconHandler", "start check change app icon result,progress:" + this.f);
            if (this.b == null) {
                AdapterForTLog.loge("ChangeAppIconHandler", "kill check change app icon");
            } else if (this.e > this.g) {
                AdapterForTLog.loge("ChangeAppIconHandler", "end check change app icon time out,progress:" + this.f);
                a(false, true);
            } else if (message.what != 1) {
            } else {
                if (this.f9320a.getPackageManager().getComponentEnabledSetting(this.b) == 1) {
                    a(true, false);
                    return;
                }
                final float max = Math.max((((float) this.e) / ((float) this.g)) * 100.0f, 100.0f);
                AdapterForTLog.loge("ChangeAppIconHandler", "check change app icon current progress:" + max);
                if (this.d != null) {
                    f.a().b(new Runnable() { // from class: com.taobao.android.change.app.icon.core.-$$Lambda$c$e5n207C9JBfmoOOt2TNKdBpievU
                        {
                            c.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            c.lambda$e5n207C9JBfmoOOt2TNKdBpievU(c.this, max);
                        }
                    });
                }
                this.e += this.h;
                sendEmptyMessageDelayed(1, this.h);
            }
        } catch (Exception e) {
            AdapterForTLog.loge("ChangeAppIconHandler", "check change app icon error " + e.getMessage(), e);
        }
    }

    public /* synthetic */ void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d.a((int) f);
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        int e = igc.e(this.f9320a);
        AdapterForTLog.loge("ChangeAppIconHandler", "------callbackResult------result:" + z + " timeOut:" + z2 + " enableLaunchers:" + e);
        b.a().d();
        final Bundle a2 = igb.CC.a(z, z2, e);
        f.a().b(new Runnable() { // from class: com.taobao.android.change.app.icon.core.-$$Lambda$c$r0yKmwEdD-dEYzerEiulrLWqzeU
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.m838lambda$r0yKmwEdDdEYzerEiulrLWqzeU(c.this, a2);
            }
        });
        Intent intent = new Intent(a.ACTION_CHANGE_APP_ICON_RESULT);
        intent.putExtras(a2);
        a.a(intent);
        ChangeAppIconRequest changeAppIconRequest = new ChangeAppIconRequest(this.c.iconName, z ? "SUCCESS" : "TIMEOUT", e);
        changeAppIconRequest.setChangeType(b.a().c());
        g.c(g.PAGE_NAME, b.TAG, com.taobao.android.weex_framework.util.a.ATOM_done, "info:" + changeAppIconRequest.toString(), null);
        com.taobao.android.change.app.icon.utils.b.a(changeAppIconRequest, new com.taobao.android.change.app.icon.mtop.a() { // from class: com.taobao.android.change.app.icon.core.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.android.change.app.icon.mtop.a
            public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f429f71", new Object[]{this, changeAppIconMtopResponse});
                } else {
                    a();
                }
            }

            @Override // com.taobao.android.change.app.icon.mtop.a
            public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("118d5450", new Object[]{this, changeAppIconMtopResponse});
                } else {
                    a();
                }
            }

            private void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                AdapterForTLog.loge("ChangeAppIconHandler", "callbackResult clear infos");
                e.a().a("");
            }
        });
    }

    public /* synthetic */ void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        igb igbVar = this.d;
        if (igbVar == null) {
            return;
        }
        igbVar.a(bundle);
    }
}
