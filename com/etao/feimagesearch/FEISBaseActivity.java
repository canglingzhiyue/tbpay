package com.etao.feimagesearch;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.common.util.i;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import tb.cok;
import tb.coo;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.irg;
import tb.kge;

/* loaded from: classes3.dex */
public class FEISBaseActivity extends ISBaseActivity implements irg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile coo b;
    private boolean c = false;

    static {
        kge.a(-146257544);
        kge.a(754605064);
    }

    public static /* synthetic */ Object ipc$super(FEISBaseActivity fEISBaseActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ coo a(FEISBaseActivity fEISBaseActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (coo) ipChange.ipc$dispatch("10c6bb62", new Object[]{fEISBaseActivity}) : fEISBaseActivity.b;
    }

    public static /* synthetic */ coo a(FEISBaseActivity fEISBaseActivity, coo cooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (coo) ipChange.ipc$dispatch("dbd7fdb5", new Object[]{fEISBaseActivity, cooVar});
        }
        fEISBaseActivity.b = cooVar;
        return cooVar;
    }

    @Override // com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        j.INSTANCE.b();
        super.onCreate(bundle);
        boolean r = b.r();
        cox.a(r);
        coy.a(r);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.c) {
            this.c = true;
            VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: com.etao.feimagesearch.FEISBaseActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FEISBaseActivity.a(FEISBaseActivity.this, cok.a());
                    if (FEISBaseActivity.a(FEISBaseActivity.this) != null) {
                        FEISBaseActivity.a(FEISBaseActivity.this).a(hashCode());
                    } else {
                        cot.a(cok.SCENE, i.b.MEASURE_ONCREATE, "faceDetector is null");
                    }
                    try {
                        com.taobao.search.mmd.util.g.a();
                    } catch (Throwable unused) {
                        com.taobao.android.searchbaseframe.util.k.a("FEISBaseActivity", "update country code error");
                    }
                }
            });
        }
        com.etao.feimagesearch.result.f.a("footprint", "enter " + getClass().getSimpleName());
    }

    @Override // com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.b == null) {
            return;
        }
        this.b.b(hashCode());
    }

    @Override // tb.irg
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            TLogTracker.b(str, map);
        }
    }
}
