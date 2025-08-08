package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bj;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class t extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f10562a;
    private volatile boolean b;
    private com.taobao.android.weex_framework.p c;
    private FrameLayout d;
    private View e;
    private com.taobao.android.weex_framework.g f;

    static {
        kge.a(1670902756);
    }

    public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    public static /* synthetic */ View a(t tVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf91dc51", new Object[]{tVar, view});
        }
        tVar.e = view;
        return view;
    }

    public static /* synthetic */ FrameLayout a(t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b6357cd6", new Object[]{tVar}) : tVar.d;
    }

    public t(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f10562a = new j(-1, -1, 17);
        this.f = new a();
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail.ttdetail.component.module.t.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                t.a(t.this, view);
                if (t.a(t.this) == null) {
                    return;
                }
                if (t.a(t.this).getChildCount() != 1 || t.a(t.this).getChildAt(0) != view) {
                    t.a(t.this).removeAllViews();
                }
                t.a(t.this).addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
            }
        });
        this.c = com.taobao.android.weex_framework.q.a().a(this.mContext, mUSInstanceConfig);
        this.c.registerRenderListener(this.f);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.f10562a;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        a();
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_weex2_container) {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
            if (a2 != null) {
                view = a2.a(this.mContext, R.layout.tt_detail_weex2_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_weex2_component, (ViewGroup) null);
            }
        }
        this.d = (FrameLayout) view.findViewById(R.id.ll_weex2_container);
        if (this.d.getChildCount() != 1 || this.d.getChildAt(0) != this.e) {
            this.d.removeAllViews();
            View view2 = this.e;
            if (view2 != null) {
                bj.a(view2);
                this.d.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
            }
        }
        return view;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b) {
        } else {
            String b = b();
            if (StringUtils.isEmpty(b)) {
                return;
            }
            this.c.initWithURL(Uri.parse(b));
            this.c.render(c(), null);
            this.b = true;
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        return d.getString("url");
    }

    private JSONObject c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d != null && (jSONObject = d.getJSONObject("params")) != null) {
            return jSONObject.getJSONObject("bridgeData");
        }
        return null;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.registerRenderListener(null);
        this.c.destroy();
    }

    /* loaded from: classes4.dex */
    public static class a implements com.taobao.android.weex_framework.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1195283139);
            kge.a(-311268728);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(com.taobao.android.weex_framework.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            }
        }

        private a() {
        }
    }
}
