package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.c;

/* loaded from: classes6.dex */
public class hwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c.a f28823a = new c.a() { // from class: tb.hwa.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tbpoplayer.view.c.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            }
        }

        @Override // com.taobao.tbpoplayer.view.c.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            }
        }
    };

    static {
        kge.a(1752097126);
    }

    public hwa() {
        c.a().a("PageTaoOrder", this.f28823a);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a("onNativePopAppear", null, null);
        }
    }

    private void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca495b2", new Object[]{this, str, jSONObject, jSONObject2});
        } else {
            c.a().a("PageTaoOrder", str, jSONObject, jSONObject2);
        }
    }
}
