package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import com.taobao.taolivecontainer.TBLiveH5Container;
import java.util.HashMap;
import tb.mfj;
import tb.mfm;
import tb.mxf;
import tb.psn;
import tb.pso;
import tb.tio;

/* loaded from: classes8.dex */
public class f extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolivecontainer.b f21986a;
    private TBLiveH5Container b;
    private String c;
    private boolean e;
    private FrameLayout f;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 1545145623) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Context context, TabMenuResponseData.TopTab topTab, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, topTab, aVar);
        if (topTab != null) {
            this.c = topTab.jumpUrl;
        }
        a();
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public View h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this}) : this.f;
    }

    private void a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        mfj.c("MoreLiveH5Frame", mxf.initView);
        if (!tio.a(this.c)) {
            new JSONObject().put("statusBarHeight", (Object) String.valueOf(98));
            this.c += "&h5Params=" + Uri.encode(JSON.toJSONString(jSONObject));
        }
        this.f = (FrameLayout) LayoutInflater.from(this.q).inflate(R.layout.taolive_more_live_h5_container, (ViewGroup) null, false);
        if (this.f21986a != null) {
            return;
        }
        mfj.c("MoreLiveH5Frame", "onRenderView " + this + " new mTBLiveH5ContainerBuilder");
        this.f21986a = new com.taobao.taolivecontainer.b(this.q, "LiveUltraHomeTab", new pso() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pso
            public void a(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
                }
            }

            @Override // tb.pso
            public void b(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
                }
            }

            @Override // tb.pso
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else {
                    TLog.loge(str, str2, str3);
                }
            }
        }, new psn() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.psn
            public String a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
            }
        }, new String[0]);
        this.f21986a.a(this);
        this.f21986a.a(this.c);
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        super.a(z, i);
        if (!this.e) {
            mfj.c("MoreLiveH5Frame", "onEvent " + this + " APPEAR mInit false");
            this.e = true;
            this.b = this.f21986a.b();
            this.b.setBackgroundColor(0);
            this.f21986a.b(this.c);
            this.b.setEnableWebViewGestureLogic(mfm.q());
            this.f.addView(this.b);
        }
        if (this.b == null) {
            return;
        }
        mfj.c("MoreLiveH5Frame", "onEvent " + this + " mTBLiveH5Container.pageAppear()");
        this.b.pageAppear();
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b != null) {
            mfj.c("MoreLiveH5Frame", "onEvent " + this + " mTBLiveH5Container.destroy()");
            this.b.destroy();
        }
        if (this.f21986a == null) {
            return;
        }
        mfj.c("MoreLiveH5Frame", "onEvent " + this + " mTBLiveH5ContainerBuilder.destroy()");
        this.f21986a.e();
    }
}
