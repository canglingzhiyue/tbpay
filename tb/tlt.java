package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/taobao/domain/ForceThemisChecker;", "Lcom/taobao/themis/taobao/domain/ITMSSwitchChecker;", "()V", "defaultDomainList", "", "orangeKey", "orangeNamespace", "getDomainRuleList", "", "matchRule", "", LinkageUtils.PolicyType.RULE, "host", "shouldSwitchToTMS", "navigationInfo", "Lcom/taobao/themis/taobao/domain/NavigationInfo;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlt implements tlu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34199a = "*.taobao.com,*.tmall.com,*.alicdn.com,*.alibaba-inc.com";
    private final String b = "pha_tab_config";
    private final String c = "themis_domain_white_list";

    static {
        kge.a(162312228);
        kge.a(848488624);
    }

    @Override // tb.tlu
    public boolean a(tlv navigationInfo) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afa51e", new Object[]{this, navigationInfo})).booleanValue();
        }
        q.d(navigationInfo, "navigationInfo");
        if (!n.b((CharSequence) navigationInfo.a(), (CharSequence) "forceThemis", false, 2, (Object) null) || (!q.a((Object) "true", (Object) navigationInfo.b().getQueryParameter("forceThemis"))) || (host = navigationInfo.b().getHost()) == null) {
            return false;
        }
        q.b(host, "navigationInfo.uri.host ?: return false");
        List<String> a2 = a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        for (String str : a2) {
            if (a(str, host)) {
                return true;
            }
        }
        return false;
    }

    private final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<String> b = n.b((CharSequence) TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal(this.b, this.c, this.f34199a), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(p.a((Iterable) b, 10));
        for (String str : b) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            arrayList.add(n.b((CharSequence) str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (q.a((Object) "*", (Object) str)) {
            return true;
        }
        if (!n.b(str, "*.", false, 2, (Object) null)) {
            return q.a((Object) str, (Object) str2);
        }
        if (str != null) {
            String substring = str.substring(2);
            q.b(substring, "(this as java.lang.String).substring(startIndex)");
            return n.c(str2, substring, false, 2, (Object) null) && str2.length() > substring.length() && str2.charAt((str2.length() - substring.length()) - 1) == '.';
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
