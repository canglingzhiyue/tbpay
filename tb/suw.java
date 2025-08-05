package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public class suw extends suv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-14667811);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(suw suwVar, String str, Object... objArr) {
        if (str.hashCode() == -8925560) {
            super.a((sur) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1695569179);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.suv, tb.suu
    public void a(sur message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77ce88", new Object[]{this, message});
            return;
        }
        q.d(message, "message");
        super.a(message);
        String c = message.c();
        switch (c.hashCode()) {
            case -1901326432:
                if (c.equals(suq.REFRESH_BROWSER_BADGE_DATA_NAME)) {
                    n(message);
                    return;
                }
                break;
            case -1831284064:
                if (c.equals(suq.H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME)) {
                    b(message);
                    return;
                }
                break;
            case -1670435775:
                if (c.equals(suq.GET_INTERACT_LOCAL_CONFIG_NAME)) {
                    i(message);
                    return;
                }
                break;
            case -1540958447:
                if (c.equals(suq.GET_NATIVE_LEFT_BUBBLE_STATE_NAME)) {
                    r(message);
                    return;
                }
                break;
            case -1135983631:
                if (c.equals(suq.GET_BROWSE_TASK_STATE_NAME)) {
                    p(message);
                    return;
                }
                break;
            case -1076308870:
                if (c.equals(suq.INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME)) {
                    e(message);
                    return;
                }
                break;
            case -804530589:
                if (c.equals(suq.INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME)) {
                    d(message);
                    return;
                }
                break;
            case -308674101:
                if (c.equals(suq.IS_INTERACTION_NEW_USER_UPGRADED_NAME)) {
                    g(message);
                    return;
                }
                break;
            case -270043148:
                if (c.equals(suq.GET_INTERACT_REMOTE_CONFIG_NAME)) {
                    j(message);
                    return;
                }
                break;
            case -68820876:
                if (c.equals(suq.IS_SHOW_INTERACTION_TASK_PANEL_NAME)) {
                    h(message);
                    return;
                }
                break;
            case 66575282:
                if (c.equals(suq.SET_DELEGATE_H5_AREAS_NAME)) {
                    k(message);
                    return;
                }
                break;
            case 510443562:
                if (c.equals(suq.BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME)) {
                    o(message);
                    return;
                }
                break;
            case 658079250:
                if (c.equals(suq.WEB_VIEW_RELOAD_NAME)) {
                    l(message);
                    return;
                }
                break;
            case 659538846:
                if (c.equals(suq.IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME)) {
                    m(message);
                    return;
                }
                break;
            case 868326996:
                if (c.equals(suq.INTERACTION_TASK_COMPLETED_NAME)) {
                    c(message);
                    return;
                }
                break;
            case 1420132356:
                if (c.equals(suq.IS_SHOW_EXTRA_BROWSER_BADGE_NAME)) {
                    f(message);
                    return;
                }
                break;
            case 1851942876:
                if (c.equals(suq.H5_TASK_STATE_CHANGE_NAME)) {
                    q(message);
                    return;
                }
                break;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "收到其他消息，message=" + message);
    }

    private final void i(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73900290", new Object[]{this, surVar});
            return;
        }
        JSONObject x = x();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(x);
    }

    private final void j(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62130911", new Object[]{this, surVar});
            return;
        }
        JSONObject y = y();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(y);
    }

    private final void k(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50960f92", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get(suq.SET_DELEGATE_H5_AREAS_ARGS_AREAS);
        if (!(obj instanceof JSONArray)) {
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                Object obj2 = jSONObject.get("x");
                Object obj3 = jSONObject.get("y");
                Object obj4 = jSONObject.get("width");
                Object obj5 = jSONObject.get("height");
                if ((obj2 instanceof Number) && (obj3 instanceof Number) && (obj4 instanceof Number) && (obj5 instanceof Number)) {
                    float floatValue = ((Number) obj2).floatValue();
                    float floatValue2 = ((Number) obj3).floatValue();
                    float floatValue3 = ((Number) obj4).floatValue();
                    float floatValue4 = ((Number) obj5).floatValue();
                    float f = 0;
                    if (floatValue >= f && floatValue3 >= f) {
                        float f2 = 1;
                        if (floatValue + floatValue3 <= f2 && floatValue2 >= f && floatValue4 >= f && floatValue2 + floatValue4 <= f2) {
                            arrayList.add(new b(floatValue, floatValue2, floatValue3, floatValue4));
                        }
                    }
                }
            }
        }
        a(arrayList);
    }

    private final void l(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f191613", new Object[]{this, surVar});
        } else {
            ck_();
        }
    }

    private final void f(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a806ef0d", new Object[]{this, surVar});
            return;
        }
        JSONObject u = u();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(u);
    }

    private final void g(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9689f58e", new Object[]{this, surVar});
            return;
        }
        JSONObject v = v();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(v);
    }

    private final void h(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850cfc0f", new Object[]{this, surVar});
            return;
        }
        JSONObject w = w();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(w);
    }

    private final void m(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9c1c94", new Object[]{this, surVar});
            return;
        }
        JSONObject W = W();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(W);
    }

    private final void n(sur surVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f2315", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE);
        if (obj instanceof String) {
            if (((CharSequence) obj).length() != 0) {
                z = false;
            }
            if (!z) {
                e_((String) obj);
                return;
            }
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "处理刷新浏览挂角数据的消息，triggerType无效");
    }

    private final void b(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfad509", new Object[]{this, surVar});
        } else {
            r();
        }
    }

    private final void c(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7ddb8a", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get(suq.INTERACTION_TASK_COMPLETED_ARGS_ACCOUNT_AMOUNT);
        if (!(obj instanceof Integer)) {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "处理其他互动任务完成的消息，accountAmount无效");
        } else {
            a(((Number) obj).intValue());
        }
    }

    private final void d(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb00e20b", new Object[]{this, surVar});
        } else {
            s();
        }
    }

    private final void e(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b983e88c", new Object[]{this, surVar});
        } else {
            t();
        }
    }

    private final void o(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa22996", new Object[]{this, surVar});
        } else {
            V();
        }
    }

    private final void p(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9253017", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        String taskName = d.getString("taskType");
        q.b(taskName, "taskName");
        JSONObject f_ = f_(taskName);
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(f_);
    }

    private final void q(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a83698", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        String taskName = d.getString("taskType");
        String taskState = d.getString("state");
        q.b(taskName, "taskName");
        q.b(taskState, "taskState");
        b_(taskName, taskState);
    }

    private final void r(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62b3d19", new Object[]{this, surVar});
            return;
        }
        JSONObject bC_ = bC_();
        sur.a g = surVar.g();
        if (g == null) {
            return;
        }
        g.a(bC_);
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34b3781f", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "获取H5互动本地配置");
        return new JSONObject();
    }

    public JSONObject y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("485b4ba0", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "获取H5互动远程配置");
        return new JSONObject();
    }

    public void a(List<b> areaList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, areaList});
            return;
        }
        q.d(areaList, "areaList");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "设置托管给H5的区域，areaList=" + areaList);
    }

    public void ck_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30efb1fe", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "WebView重新加载的时机");
        }
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9bbfd9c", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "是否展示剩余的浏览挂角");
        return new JSONObject();
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d63d11d", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "是否发生了互动新用户简化链路升级");
        return new JSONObject();
    }

    public JSONObject w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("210ba49e", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "是否展示互动任务面板");
        return new JSONObject();
    }

    public JSONObject W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac11347e", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "是否发生了浏览挂角倒计时完成");
        return new JSONObject();
    }

    public void e_(String triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe077ab", new Object[]{this, triggerType});
            return;
        }
        q.d(triggerType, "triggerType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "刷新浏览挂角数据，triggerType=" + triggerType);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "H5互动组件首次渲染完成的时机");
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "其他互动任务完成的时机（上滑任务、签到任务等），accountAmount=" + i);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "互动新用户简化链路升级弹窗渲染完成的时机");
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "互动任务面板中浏览视频按钮点击的时机");
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "浏览提现气泡隐藏的时机");
        }
    }

    public JSONObject f_(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9cd409aa", new Object[]{this, name});
        }
        q.d(name, "name");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "获取" + name + " 的任务状态");
        return new JSONObject();
    }

    public void b_(String taskName, String state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b58d58", new Object[]{this, taskName, state});
            return;
        }
        q.d(taskName, "taskName");
        q.d(state, "state");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "H5任务状态发生变化:" + taskName + " => " + state);
    }

    public JSONObject bC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b44d7505", new Object[]{this});
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractMessageObserver", "尝试获得native左侧挂角状态");
        return new JSONObject();
    }

    /* loaded from: classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float f33918a;
        private final float b;
        private final float c;
        private final float d;

        static {
            kge.a(-26596186);
        }

        public b(float f, float f2, float f3, float f4) {
            this.f33918a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f33918a;
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
        }

        public final float c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
        }

        public final float d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "{ratioX=" + this.f33918a + "，ratioY=" + this.b + "，ratioWidth=" + this.c + "，ratioHeight=" + this.d + '}';
        }
    }
}
