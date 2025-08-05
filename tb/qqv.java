package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/pub/menu/MenuItemMoreChannel;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getId", "", "getMenuItemData", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "onClick", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qqv extends d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1956526996);
    }

    public static /* synthetic */ Object ipc$super(qqv qqvVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqv(ITMSPage page) {
        super(page);
        q.d(page, "page");
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : f();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.id.menu_item_more_channel;
    }

    public TBPublicMenuItem f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("83ef9203", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("ꅚ:更多频道").build();
        q.b(build, "TBPublicMenuItem.Builder…ꅚ:更多频道\")\n        .build()");
        return build;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Object a2 = qpt.a(INavigatorAdapter.class);
        q.b(a2, "TMSAdapterManager.getNot…gatorAdapter::class.java)");
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) a2;
        Activity o = b().o();
        q.b(o, "mInstance.activity");
        INavigatorAdapter.b.a(iNavigatorAdapter, o, n.h(), null, null, null, 16, null);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "miniapp_id", b().h());
        jSONObject2.put((JSONObject) "target_page_url", n.h());
        HashMap hashMap = new HashMap();
        String jSONString = jSONObject.toJSONString();
        q.b(jSONString, "utParamCnt.toJSONString()");
        hashMap.put("utparam-cnt", jSONString);
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.customAdvance("2101", "TRVTbApiPage", "clk_sort_icon", "", "", ai.b(hashMap), null);
        }
        super.c();
    }
}
