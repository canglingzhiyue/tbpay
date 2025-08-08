package com.taobao.themis.mix.pha_render;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.e;
import com.taobao.pha.core.i;
import com.taobao.pha.core.phacontainer.PHAFragment;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.utils.f;
import com.taobao.themis.utils.o;
import tb.kge;
import tb.qpu;

/* loaded from: classes9.dex */
public class PHAFragmentHostNew extends PHAFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private volatile boolean hasDowngrade = false;
    private String mDowngradeUrl;
    private e.b mEventListener;
    private i mExternalMethodChannel;
    private int mNavigationBarHeight;
    private ITMSPage mPage;

    private void addDowngradeMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a4236d", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(PHAFragmentHostNew pHAFragmentHostNew, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1143273930) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.downgrade((Uri) objArr[0], (DowngradeType) objArr[1], (Boolean) objArr[2]));
        }
    }

    public static /* synthetic */ ITMSPage access$000(PHAFragmentHostNew pHAFragmentHostNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("b5057ab0", new Object[]{pHAFragmentHostNew}) : pHAFragmentHostNew.mPage;
    }

    static {
        kge.a(-619599143);
        TAG = PHAFragmentHostNew.class.getSimpleName();
    }

    public void setEventListener(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923a68e2", new Object[]{this, bVar});
        } else {
            this.mEventListener = bVar;
        }
    }

    public void setExternalMethodChannel(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77848d3", new Object[]{this, iVar});
        } else {
            this.mExternalMethodChannel = iVar;
        }
    }

    public void setDowngradeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac267fcd", new Object[]{this, str});
        } else {
            this.mDowngradeUrl = str;
        }
    }

    public void setPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, iTMSPage});
        } else {
            this.mPage = iTMSPage;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.PHAFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mNavigationBarHeight = arguments.getInt("navigationBarHeight", 0);
        this.mContainerType = PHAContainerType.MINIAPP;
    }

    @Override // com.taobao.pha.core.phacontainer.PHAFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (this.mAppController != null) {
        } else {
            try {
                this.mAppController = new AppController(getContext(), this.mManifestUrl, this.mContainerType, this, this.mUrlHashCode);
                this.mAppController.a("isThemis", "true");
                this.mAppController.a("tmsSDKVersion", "1.1");
                this.mAppController.a("tmsAppId", this.mPage.b().h());
                this.mAppController.a("tmsBizType", MspGlobalDefine.TINY_APP);
                this.mAppController.a("tmsSolutionType", TMSSolutionType.getType(this.mPage.b()).name());
                this.mAppController.a("tmsHomePage", "true");
                this.mAppController.a("tmsRenderType", this.mPage.o());
                qpu k = this.mPage.b().k();
                if (k.b("containerStart")) {
                    this.mAppController.a("TINYAPP_pageStart", f.c(k.c("containerStart")));
                    this.mAppController.a("TMS_appStart", f.c(k.c("containerStart")));
                }
                if (this.mExternalMethodChannel != null) {
                    this.mAppController.a(this.mExternalMethodChannel);
                }
                if (this.mEventListener != null) {
                    this.mAppController.a(this.mEventListener);
                }
                this.mAppController.a(bundle);
            } catch (Exception e) {
                String str = TAG;
                Log.e(str, "create AppController error:" + e.toString());
            }
        }
    }

    @Override // com.taobao.pha.core.phacontainer.PHAFragment, com.taobao.pha.core.controller.d
    public int getNavigationBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f7254aa", new Object[]{this})).intValue() : this.mNavigationBarHeight;
    }

    @Override // com.taobao.pha.core.phacontainer.PHAFragment, com.taobao.pha.core.controller.d
    public boolean downgrade(Uri uri, DowngradeType downgradeType, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4424f9ca", new Object[]{this, uri, downgradeType, bool})).booleanValue();
        }
        if (this.hasDowngrade) {
            return true;
        }
        if (this.mPage == null) {
            return false;
        }
        this.hasDowngrade = true;
        String str = this.mDowngradeUrl;
        addDowngradeMonitor();
        if (StringUtils.isEmpty(str) && this.mAppController != null) {
            str = this.mAppController.getDowngradeUrlFromManifest();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        Uri b = o.b(str);
        if (m.e(o.b(this.mPage.b().g()))) {
            b = m.f(b);
        }
        com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.mix.pha_render.PHAFragmentHostNew.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PHAFragmentHostNew.access$000(PHAFragmentHostNew.this).b() == null || PHAFragmentHostNew.access$000(PHAFragmentHostNew.this).b().o() == null) {
                } else {
                    PHAFragmentHostNew.access$000(PHAFragmentHostNew.this).b().o().finish();
                }
            }
        }, 100L);
        return super.downgrade(b, downgradeType, bool);
    }

    private void showErrorView(com.taobao.themis.kernel.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12b27bd", new Object[]{this, eVar});
        } else {
            TMSLogger.d(TAG, "show error view failed!");
        }
    }

    @Override // com.taobao.pha.core.phacontainer.PHAFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
