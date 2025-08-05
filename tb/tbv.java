package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/infoflow/webview/util/IgnoreParamsProcessUtil;", "", "()V", "PRE_REQUEST_IGNORE_WHITE_LIST", "", "getIgnoreParamsProcessedUrl", "url", "getPreRequestWhiteList", "", "removeUrlPart", "partName", "subString", k.a.PARAM_KEY_LIST_START_INDEX, "", "endIndex", "text", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class tbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tbv INSTANCE;

    static {
        kge.a(-1543943902);
        INSTANCE = new tbv();
    }

    private tbv() {
    }

    public final String a(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, url});
        }
        q.d(url, "url");
        List<String> a2 = a();
        if (a2.isEmpty()) {
            return url;
        }
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            url = a(url, a2.get(i));
        }
        return url;
    }

    private final List<String> a() {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String a3 = ldj.a("preRequestWhiteList", "spm,scm");
        if (!(a3 == null || a3.length() == 0)) {
            List<String> split = new Regex(",").split(a3, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        a2 = p.c(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            a2 = p.a();
            Object[] array = a2.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                arrayList.addAll(p.b((String[]) Arrays.copyOf(strArr, strArr.length)));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return arrayList;
    }

    private final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String str3 = str2 + '=';
        String str4 = str;
        if (!n.b((CharSequence) str4, (CharSequence) str3, false, 2, (Object) null)) {
            return str;
        }
        String a2 = a(n.a((CharSequence) str4, str3, 0, false, 6, (Object) null) + str3.length(), str.length(), str);
        String str5 = a2;
        String a3 = n.b((CharSequence) str5, (CharSequence) "&", false, 2, (Object) null) ? a(n.a((CharSequence) str5, "&", 0, false, 6, (Object) null) + 1, a2.length(), a2) : "";
        StringBuilder sb = new StringBuilder();
        int a4 = n.a((CharSequence) str4, str3, 0, false, 6, (Object) null);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(0, a4);
        q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(a3);
        return sb.toString();
    }

    private final String a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7529d04e", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        if (i2 <= i) {
            return "";
        }
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i, i2);
        q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
