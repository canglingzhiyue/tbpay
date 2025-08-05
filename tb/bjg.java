package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class bjg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_TYPE_DELETE = "delete";
    public static final String OP_TYPE_INSERT = "insert";
    public static final String OP_TYPE_RELOAD = "reload";
    public static final String OP_TYPE_REPLACE = "replace";

    /* renamed from: a  reason: collision with root package name */
    public String f25938a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-1322467013);
    }

    public static bjg a(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjg) ipChange.ipc$dispatch("f5a6408f", new Object[]{bjhVar});
        }
        bjg bjgVar = new bjg();
        bjgVar.f25938a = "delete";
        bjgVar.b = bjhVar.g();
        return bjgVar;
    }

    public static bjg b(bjh bjhVar) {
        bjh bjhVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjg) ipChange.ipc$dispatch("dd4816ee", new Object[]{bjhVar});
        }
        bjg bjgVar = new bjg();
        bjgVar.f25938a = "insert";
        bjgVar.b = bjhVar.g();
        bjh j = bjhVar.j();
        if (j != null) {
            bjgVar.c = j.g();
            int indexOf = j.k().indexOf(bjhVar);
            if (indexOf > 0 && (bjhVar2 = j.k().get(indexOf - 1)) != null) {
                bjgVar.d = bjhVar2.g();
            }
        } else {
            UnifyLog.d("DiffInfo", "createInsertDiff parent is null: " + bjgVar.b);
        }
        return bjgVar;
    }

    public static bjg c(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjg) ipChange.ipc$dispatch("c4e9ed4d", new Object[]{bjhVar});
        }
        bjg bjgVar = new bjg();
        bjgVar.f25938a = "replace";
        bjgVar.b = bjhVar.g();
        bjh j = bjhVar.j();
        if (j != null) {
            bjgVar.c = j.g();
        }
        return bjgVar;
    }

    public static bjg d(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjg) ipChange.ipc$dispatch("ac8bc3ac", new Object[]{bjhVar});
        }
        bjg bjgVar = new bjg();
        bjgVar.f25938a = "reload";
        bjgVar.b = bjhVar.g();
        return bjgVar;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) this.f25938a);
        String str = this.b;
        if (str != null) {
            jSONObject.put("target", (Object) str);
        }
        String str2 = this.c;
        if (str2 != null) {
            jSONObject.put(c.MSG_SOURCE_PARENT, (Object) str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            jSONObject.put("position", (Object) str3);
        }
        return jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DiffInfo: opType:" + this.f25938a + ", target:" + this.b + ", parent:" + this.c + ", position:" + this.d;
    }
}
