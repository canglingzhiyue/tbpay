package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.bgp;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/OpenWeexFloatPageAbility;", "Lcom/taobao/umipublish/extension/windvane/abilities/BaseAbility;", bgp.FRAGMENT, "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "onExecute", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class OpenWeexFloatPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLASS_NAME = "com.taobao.umipublish.biz.weex.UnifyWeexFloatActivity";
    public static final Companion Companion;
    public static final String TAG = "OpenWeexFloatPageAbility";
    private static final String UNIFY_WEEX_ACTION = "android.intent.action.UMI";

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f23338a;

    static {
        kge.a(-569432344);
        Companion = new Companion(null);
    }

    public OpenWeexFloatPageAbility(Fragment fragment) {
        q.d(fragment, "fragment");
        this.f23338a = fragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/OpenWeexFloatPageAbility$Companion;", "", "()V", "CLASS_NAME", "", RPCDataItems.SWITCH_TAG_LOG, "UNIFY_WEEX_ACTION", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class Companion {
        static {
            kge.a(917082160);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "Params is null");
        } else {
            String string = jSONObject.getString("weexUrl");
            String str = string;
            if (str == null || str.length() == 0) {
                errorCallback("2", "WeexUrl is null");
                return;
            }
            Uri.Builder buildUpon = Uri.parse(string).buildUpon();
            buildUpon.appendQueryParameter(e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            buildUpon.appendQueryParameter("is_loading", "0");
            buildUpon.appendQueryParameter("wx_opaque", "0");
            buildUpon.appendQueryParameter("bgContainerColor", "#00000000");
            Bundle bundle = new Bundle();
            try {
                bundle.putSerializable("unify_weex_init_data", jSONObject.getJSONObject("params"));
                bundle.putInt("top_offset", jSONObject.getIntValue("topOffset"));
            } catch (Exception e) {
                u.d(TAG, e.getMessage());
            }
            Nav withFragment = Nav.from(this.mContext).withExtras(bundle).withAction(UNIFY_WEEX_ACTION).withFragment(this.f23338a);
            Context mContext = this.mContext;
            q.b(mContext, "mContext");
            withFragment.withClassName(mContext.getPackageName(), CLASS_NAME).forResult(60005).toUri(buildUpon.build());
        }
    }
}
