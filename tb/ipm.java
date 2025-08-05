package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\u001f\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"convertToDXTemplate", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "Lcom/alibaba/fastjson/JSONObject;", "safePeek", "E", "Ljava/util/Stack;", "(Ljava/util/Stack;)Ljava/lang/Object;", "icart-core-android_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ipm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(304620262);
    }

    public static final <E> E a(Stack<E> stack) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("e342f221", new Object[]{stack});
        }
        Stack<E> stack2 = stack;
        if (stack2 == null || stack2.isEmpty()) {
            z = true;
        }
        if (!z) {
            return stack.peek();
        }
        return null;
    }

    public static final DXTemplateItem a(JSONObject jSONObject) {
        String string;
        String string2;
        Long e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("44f25f37", new Object[]{jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("name")) == null || (string2 = jSONObject.getString("version")) == null || (e = n.e(string2)) == null) {
            return null;
        }
        long longValue = e.longValue();
        String string3 = jSONObject.getString("url");
        if (string3 == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = string;
        dXTemplateItem.b = longValue;
        dXTemplateItem.c = string3;
        return dXTemplateItem;
    }
}
