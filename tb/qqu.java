package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/pub/menu/MenuItemComment;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getId", "", "getMenuItemData", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", "getReportExtraInfo", "Lcom/alibaba/fastjson/JSONObject;", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "onClick", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qqu extends d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(760450309);
    }

    public static /* synthetic */ Object ipc$super(qqu qquVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqu(ITMSPage page) {
        super(page);
        q.d(page, "page");
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : g();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.id.menu_item_comment;
    }

    public TBPublicMenuItem g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("83792c04", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("뀚:评分及评论").build();
        q.b(build, "TBPublicMenuItem.Builder…tTitle(\"뀚:评分及评论\").build()");
        return build;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public void c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        Uri.Builder buildUpon = o.b(n.i()).buildUpon();
        JSONObject f = f();
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, Object> entry : f.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value == null || (str = value.toString()) == null) {
                str = "";
            }
            builder.appendQueryParameter(key, str);
        }
        buildUpon.appendQueryParameter("query", builder.build().toString());
        if (iNavigatorAdapter != null) {
            Activity o = b().o();
            q.b(o, "mInstance.activity");
            String uri = buildUpon.build().toString();
            q.b(uri, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, o, uri, null, null, null, 16, null);
        }
        super.c();
    }

    private final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "appVersion", k.d(b()));
        jSONObject2.put((JSONObject) "appId", b().h());
        jSONObject2.put((JSONObject) "appName", k.j(b()));
        jSONObject2.put((JSONObject) "frameType", k.a(b()));
        jSONObject2.put((JSONObject) "bizType", k.b(b()));
        jSONObject2.put((JSONObject) i.SUB_KEY_FRAGMENT_JUMP, k.c(b()));
        jSONObject2.put((JSONObject) "appType", "tms");
        jSONObject2.put((JSONObject) "templateId", k.g(b()));
        jSONObject2.put((JSONObject) "templateVersion", k.i(b()));
        String openModel = b().q().getOpenModel();
        if (TextUtils.equals(openModel, com.taobao.themis.kernel.i.KEY_AFC_OPEN_LINK) || TextUtils.equals(openModel, com.taobao.themis.kernel.i.KEY_BROWSER_LINK)) {
            jSONObject2.put((JSONObject) "isFromOuter", "true");
        }
        return jSONObject;
    }
}
