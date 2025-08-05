package com.taobao.umipublish.extension.windvane;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.b;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.p;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import com.taobao.taopai.material.a;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;
import java.util.ArrayList;
import tb.hdx;
import tb.hfj;
import tb.kge;
import tb.sqj;

/* loaded from: classes9.dex */
public class MaterialVersionChecker implements IMaterialVersionChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_ERROR = "500";
    private static final String TAG = "VersionCheckUtil";
    private final b sLoadingConfig = new b.a().a(0.5f).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_please_wait)).a(false).a();
    private final int INVALID_MATERIAL_ID = -1;
    private String mBizLine = "guangguang";
    private String mBizScene = "guangguang";
    private sqj.a EMPTY_RUNNABLE = new sqj.a() { // from class: com.taobao.umipublish.extension.windvane.MaterialVersionChecker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.sqj.a
        public void a(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
            }
        }

        @Override // tb.sqj.a
        public void a(MaterialDetail materialDetail, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c82d1e96", new Object[]{this, materialDetail, str, str2});
            }
        }
    };

    static {
        kge.a(-1547203045);
        kge.a(-279431658);
    }

    @Override // tb.sqj
    public void check(Context context, int i, sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f664d1", new Object[]{this, context, new Integer(i), aVar});
        }
    }

    public static /* synthetic */ boolean access$000(MaterialVersionChecker materialVersionChecker, SpecifiedFilterResultBean specifiedFilterResultBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4cd979", new Object[]{materialVersionChecker, specifiedFilterResultBean})).booleanValue() : materialVersionChecker.isEmptyResponse(specifiedFilterResultBean);
    }

    public static /* synthetic */ String access$100(MaterialVersionChecker materialVersionChecker, SpecifiedFilterResultBean specifiedFilterResultBean, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fab4402", new Object[]{materialVersionChecker, specifiedFilterResultBean, str}) : materialVersionChecker.getErrorCode(specifiedFilterResultBean, str);
    }

    public static /* synthetic */ void access$200(MaterialVersionChecker materialVersionChecker, Activity activity, String str, String str2, sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7885a9a", new Object[]{materialVersionChecker, activity, str, str2, aVar});
        } else {
            materialVersionChecker.toastAndCallbackError(activity, str, str2, aVar);
        }
    }

    @Override // tb.sqj
    public void check(Context context, int i, JSONObject jSONObject, sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf533ed", new Object[]{this, context, new Integer(i), jSONObject, aVar});
        } else if (!(context instanceof FragmentActivity) || i != 0) {
        } else {
            checkFunTemplateVersion((FragmentActivity) context, jSONObject, notNullRunnable(aVar));
        }
    }

    private sqj.a notNullRunnable(sqj.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqj.a) ipChange.ipc$dispatch("4ace12f8", new Object[]{this, aVar}) : aVar == null ? this.EMPTY_RUNNABLE : aVar;
    }

    private void checkFunTemplateVersion(FragmentActivity fragmentActivity, JSONObject jSONObject, sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7b0ee2", new Object[]{this, fragmentActivity, jSONObject, aVar});
            return;
        }
        int a2 = m.a(jSONObject, "fun_id", -1);
        if (a2 == -1) {
            u.b(TAG, "there is no default material. then valid!");
            aVar.a(null);
            return;
        }
        check(fragmentActivity, String.valueOf(a2), hdx.LE_VERSION, com.alibaba.ability.localization.b.a(R.string.gg_pub_prop), aVar);
    }

    public void check(final FragmentActivity fragmentActivity, final String str, int i, final String str2, final sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74118596", new Object[]{this, fragmentActivity, str, new Integer(i), str2, aVar});
        } else if (aVar == null) {
        } else {
            p.a(fragmentActivity, this.sLoadingConfig);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(at.a(str, -1L)));
            new a(fragmentActivity, this.mBizLine, this.mBizScene).a(this.mBizLine, this.mBizScene, i, arrayList, new com.taobao.taopai2.material.business.specified.a() { // from class: com.taobao.umipublish.extension.windvane.MaterialVersionChecker.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taopai2.material.business.specified.a
                public void a(SpecifiedFilterResultBean specifiedFilterResultBean) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6315f6e", new Object[]{this, specifiedFilterResultBean});
                        return;
                    }
                    p.b(fragmentActivity);
                    if (MaterialVersionChecker.access$000(MaterialVersionChecker.this, specifiedFilterResultBean)) {
                        MaterialVersionChecker materialVersionChecker = MaterialVersionChecker.this;
                        MaterialVersionChecker.access$200(materialVersionChecker, fragmentActivity, MaterialVersionChecker.access$100(materialVersionChecker, specifiedFilterResultBean, str), str2, aVar);
                        return;
                    }
                    MaterialDetail materialDetail = new MaterialDetail();
                    materialDetail.copyFrom(specifiedFilterResultBean.mMaterialList.get(0));
                    aVar.a(materialDetail);
                }

                @Override // tb.qbu
                public void a(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                        return;
                    }
                    p.b(fragmentActivity);
                    MaterialVersionChecker.access$200(MaterialVersionChecker.this, fragmentActivity, "500", str2, aVar);
                }
            });
        }
    }

    private String getErrorCode(SpecifiedFilterResultBean specifiedFilterResultBean, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("708274aa", new Object[]{this, specifiedFilterResultBean, str}) : (specifiedFilterResultBean.mRuleMap == null || specifiedFilterResultBean.mRuleMap.get(str) == null) ? "500" : String.valueOf(specifiedFilterResultBean.mRuleMap.get(str).mRuleCode);
    }

    private boolean isEmptyResponse(SpecifiedFilterResultBean specifiedFilterResultBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5340d75", new Object[]{this, specifiedFilterResultBean})).booleanValue() : specifiedFilterResultBean == null || specifiedFilterResultBean.mMaterialList == null || specifiedFilterResultBean.mMaterialList.isEmpty() || specifiedFilterResultBean.mMaterialList.get(0) == null;
    }

    private void toastAndCallbackError(Activity activity, String str, String str2, sqj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14da5ea7", new Object[]{this, activity, str, str2, aVar});
            return;
        }
        String b = s.b(str, str2);
        hfj.a(activity, b);
        aVar.a(null, str, b);
    }
}
