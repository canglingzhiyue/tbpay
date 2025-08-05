package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.p;
import com.taobao.tmgcashier.TMGCashierActivity;
import com.taobao.tmgcashier.constant.TMGCashierRenderType;
import com.taobao.tmgcashier.fragment.TMGCashierWebView;
import com.taobao.tmgcashier.jsbridge.CashJSBridge;
import com.taobao.tmgcashier.jsbridge.TMGCashierJSBridge;
import com.taobao.tmgcashier.prefetch.PrefetchDataState;
import com.taobao.tmgcashier.view.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.nai;

/* loaded from: classes9.dex */
public class nap extends nah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31357a;
    private String b;

    static {
        kge.a(-309994779);
    }

    public static /* synthetic */ Object ipc$super(nap napVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public nap(a aVar) {
        this.f31357a = aVar;
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        this.b = intent.getData().toString();
        if (TextUtils.isEmpty(this.b)) {
            Toast.makeText(this.f31357a.b(), "url 链接为空！", 0).show();
            b();
            return;
        }
        q.a("TMGCashier", (Class<? extends e>) TMGCashierJSBridge.class);
        q.a("ALBBCashier", (Class<? extends e>) CashJSBridge.class);
        if (naj.a().b() == null) {
            nai.a aVar = new nai.a();
            aVar.a(TMGCashierRenderType.RENDER_TYPE_WEEX);
            naj.a().a(aVar.a());
        }
        c();
    }

    public void a() {
        String bundleUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FragmentManager supportFragmentManager = ((TMGCashierActivity) this.f31357a).getSupportFragmentManager();
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments.size() > 1) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment fragment = fragments.get(fragments.size() - 1);
            if (fragments.size() > 1) {
                Fragment fragment2 = fragments.get(fragments.size() - 2);
                if (fragment2 == null) {
                    Log.e(TMGCashierWebView.TAG, "nextShowFragment 为空");
                    b();
                    return;
                }
                if (fragment2 instanceof WeexFragment) {
                    bundleUrl = ((WeexFragment) fragment2).getBundleUrl();
                } else {
                    bundleUrl = fragment2 instanceof TMGCashierWebView ? ((TMGCashierWebView) fragment2).getBundleUrl() : "";
                }
                f(bundleUrl);
                beginTransaction.remove(fragment).show(fragment2).commitAllowingStateLoss();
                ((TMGCashierActivity) this.f31357a).a(fragment2);
                return;
            }
            Log.e(TMGCashierWebView.TAG, "fragments size 小于2个");
            b();
            return;
        }
        b();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Fragment d = d();
        if (d == null) {
            return;
        }
        this.f31357a.a(d, false, "");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b = str;
            this.f31357a.a(d(), false, "");
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Intent intent = new Intent(this.f31357a.b(), TMGCashierActivity.class);
            intent.setData(Uri.parse(str));
            this.f31357a.b().startActivity(intent);
            b();
        }
    }

    public void c(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.isNull("url") ? null : jSONObject.getString("url");
        if (!TextUtils.isEmpty(string)) {
            this.b = string;
        }
        this.f31357a.a(d(), true, jSONObject.has("currentUrl") ? jSONObject.getString("currentUrl") : "");
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            this.f31357a.a(g(new JSONObject(str).optString("url")), false, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.f31357a.a();
        this.b = str;
        c();
    }

    private Fragment d() {
        TMGCashierRenderType a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4e9ed04d", new Object[]{this});
        }
        nai b = naj.a().b();
        if (b == null) {
            a2 = TMGCashierRenderType.RENDER_TYPE_WEEX;
        } else {
            a2 = b.a();
        }
        if (a2 == TMGCashierRenderType.RENDER_TYPE_WEEX && nal.a(this.b)) {
            Uri parse = Uri.parse(this.b);
            if (this.b.contains("renderType=2") && !this.b.contains("wh_weex=true")) {
                this.b = parse.buildUpon().appendQueryParameter("wh_weex", "true").build().toString();
            }
            return e();
        }
        return g(this.b);
    }

    private Fragment e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("6246a3ce", new Object[]{this});
        }
        WeexFragment weexFragment = null;
        try {
            weexFragment = WeexFragment.newInstance(this.b, this.b, null, null, null);
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("renderMode", (Object) UltronTradeHybridInstanceRenderMode.TEXTURE);
            Bundle arguments = weexFragment.getArguments();
            if (arguments != null) {
                arguments.putString("config", jSONObject.toString());
                weexFragment.setArguments(arguments);
            }
            weexFragment.setRenderListener(this);
            return weexFragment;
        } catch (Exception e) {
            e.getMessage();
            return weexFragment;
        }
    }

    private Fragment g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("ed98d1a", new Object[]{this, str});
        }
        TMGCashierWebView tMGCashierWebView = new TMGCashierWebView(str);
        Bundle bundle = new Bundle();
        bundle.putString(TMGCashierWebView.CONTENT_URL, str);
        tMGCashierWebView.setArguments(bundle);
        return tMGCashierWebView;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.f31357a.a(g(this.b.replace("renderType=2", "").replace("wh_weex=true", "")), true, "");
        nan.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_weexDowngrade", "oversea_url:" + this.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = this.f31357a;
        if (!(aVar instanceof Activity)) {
            return;
        }
        ((Activity) aVar).finish();
    }

    public void a(WVCallBackContext wVCallBackContext) {
        PrefetchDataState prefetchDataState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
            return;
        }
        a aVar = this.f31357a;
        if (!(aVar instanceof TMGCashierActivity) || (prefetchDataState = ((TMGCashierActivity) aVar).e) == null) {
            return;
        }
        prefetchDataState.setCallBack(wVCallBackContext);
        prefetchDataState.setState(PrefetchDataState.PrefetchDataStateEnum.REQUESTED, null);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
