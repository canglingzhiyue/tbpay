package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* loaded from: classes.dex */
public class ldo implements lkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ISceneService f30504a;

    static {
        kge.a(-1499346527);
        kge.a(1554441251);
    }

    public ldo(ljs ljsVar, ISceneService iSceneService) {
        this.f30504a = iSceneService;
    }

    @Override // tb.llb
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            this.f30504a.onNewIntent(intent);
        }
    }

    @Override // tb.llb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.f30504a.onStart();
        }
    }

    @Override // tb.llb
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            this.f30504a.onRestart();
        }
    }

    @Override // tb.llb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.f30504a.onResume();
        }
    }

    @Override // tb.llb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.f30504a.onPause();
        }
    }

    @Override // tb.llb
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        } else {
            this.f30504a.onColdStartResume();
        }
    }

    @Override // tb.llb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.f30504a.onStop();
        }
    }

    @Override // tb.llb
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        } else {
            this.f30504a.onWillExit();
        }
    }

    @Override // tb.llb
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            this.f30504a.onDestroyView();
        }
    }

    @Override // tb.llb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f30504a.onDestroy();
        }
    }

    @Override // tb.llb
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.f30504a.onActivityResult(i, i2, intent);
        }
    }
}
