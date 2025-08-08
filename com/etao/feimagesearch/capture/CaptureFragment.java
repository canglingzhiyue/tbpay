package com.etao.feimagesearch.capture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.cip.capture.CaptureModule;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.j;
import com.etao.feimagesearch.result.IrpJsBridge;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.etao.feimagesearch.videosearch.result.NewIrpMuiseModule;
import com.taobao.android.searchbaseframe.ace.a;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.search.common.util.i;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cot;
import tb.cpb;
import tb.cpt;
import tb.cpu;
import tb.cri;
import tb.dau;
import tb.kge;

/* loaded from: classes3.dex */
public final class CaptureFragment extends TBBaseFragment implements cpu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cpt captureController;
    private boolean hasPreloadIrpTemplate;

    static {
        kge.a(22680638);
        kge.a(-604257488);
    }

    public static /* synthetic */ Object ipc$super(CaptureFragment captureFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initPltSDK();
        dau.a(getActivity());
        FragmentActivity activity = getActivity();
        q.a((Object) activity, "activity");
        this.captureController = new cpb(activity, false);
        if (!com.a()) {
            return;
        }
        a.b(getActivity());
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        return cptVar.a(inflater, viewGroup, bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.r();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a("PltCamera");
        super.onResume();
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.a();
        preloadIrpTemplate();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.b();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.c();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.d();
        if (!b.eb()) {
            return;
        }
        com.etao.feimagesearch.capture.dynamic.templates.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.a(i, i2, intent);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        cptVar.a(intent);
    }

    private final void initPltSDK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5481fbd9", new Object[]{this});
            return;
        }
        j.INSTANCE.b();
        try {
            com.taobao.search.musie.j.a(Globals.getApplication());
            SearchXslSdk.install();
            MUSEngine.registerModule(IrpMuiseModule.NAME, NewIrpMuiseModule.class);
            MUSEngine.registerModule(CaptureModule.NAME, CaptureModule.class);
            cri.a();
            MUSEngine.registerUINode(TBAlbumImg.NODE_NAME, TBAlbumImg.class);
            android.taobao.windvane.jsbridge.q.a(IrpJsBridge.NAME, (Class<? extends e>) CaptureJSBridge.class, true);
        } catch (Exception e) {
            cot.a("CaptureFragments", i.b.MEASURE_ONCREATE, e);
        }
        com.taobao.search.rainbow.a.b();
    }

    private final void preloadIrpTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32764bf", new Object[]{this});
        } else if (this.hasPreloadIrpTemplate || !b.cq()) {
        } else {
            String bW = b.bW();
            if (StringUtils.isEmpty(bW)) {
                return;
            }
            this.hasPreloadIrpTemplate = true;
            com.etao.feimagesearch.capture.dynamic.templates.b.a(bW, (JSONObject) null, true);
        }
    }

    @Override // tb.cpu
    public cpt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpt) ipChange.ipc$dispatch("1e66a315", new Object[]{this});
        }
        cpt cptVar = this.captureController;
        if (cptVar == null) {
            q.b("captureController");
        }
        return cptVar;
    }
}
