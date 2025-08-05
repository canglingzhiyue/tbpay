package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.monitor.b;
import com.taobao.tao.messagekit.base.monitor.c;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import tb.omb;

/* loaded from: classes8.dex */
public class ome extends oma implements omb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Queue<b> b = new LinkedList();
    private boolean c;
    private int d;

    /* loaded from: classes8.dex */
    public class a implements com.taobao.tao.messagekit.core.model.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<b> b;

        static {
            kge.a(-1357293092);
            kge.a(612839925);
        }

        public a(List<b> list) {
            this.b = list;
        }

        @Override // com.taobao.tao.messagekit.core.model.a
        public void a(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
                return;
            }
            String str = map != null ? (String) map.get("re_msg") : null;
            if (i == 1000) {
                d.a().h().a(ome.a(ome.this), this.b);
                com.taobao.tao.messagekit.core.utils.d.a("MKT", "upload");
                com.taobao.tao.messagekit.core.utils.d.a("MKT", "aac", this.b.size());
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(ome.a(ome.this));
                objArr[1] = "uploadAck success";
                List<b> list = this.b;
                objArr[2] = Integer.valueOf(list != null ? list.size() : 0);
                objArr[3] = Integer.valueOf(ome.b(ome.this).size());
                MsgLog.c(c.TAG, objArr);
            } else {
                d.a().h().b(ome.a(ome.this), this.b);
                com.taobao.tao.messagekit.core.utils.d.a("MKT", "upload", "" + i, str);
                Object[] objArr2 = new Object[6];
                objArr2[0] = Integer.valueOf(ome.a(ome.this));
                objArr2[1] = "uploadAck failed: ";
                objArr2[2] = Integer.valueOf(i);
                objArr2[3] = str;
                List<b> list2 = this.b;
                objArr2[4] = Integer.valueOf(list2 != null ? list2.size() : 0);
                objArr2[5] = Integer.valueOf(ome.b(ome.this).size());
                MsgLog.c(c.TAG, objArr2);
            }
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(ome.this, false, false);
        }
    }

    static {
        kge.a(-569371589);
        kge.a(198949036);
    }

    public ome(int i) {
        this.d = i;
    }

    public static /* synthetic */ int a(ome omeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f82dc724", new Object[]{omeVar})).intValue() : omeVar.d;
    }

    public static /* synthetic */ Queue b(ome omeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("7cf2a152", new Object[]{omeVar}) : omeVar.b;
    }

    @Override // tb.oma
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        f();
    }

    @Override // tb.omb.a
    public void a(omb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8f2d37", new Object[]{this, aVar});
        } else if (aVar == this) {
            f();
        } else if (!(aVar instanceof ome)) {
        } else {
            ((ome) aVar).e();
        }
    }

    @Override // tb.oma
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // tb.omb.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.addAll(a(this.d).a(-1));
        }
    }

    public void f() {
        b poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b.size() <= 0) {
            this.c = true;
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < 100 && (poll = this.b.poll()) != null; i++) {
                    arrayList.add(poll);
                    JSONObject e = poll.e();
                    e.put(rrv.UPLOAD_TIME, (Object) Long.valueOf(currentTimeMillis));
                    jSONArray.add(e);
                }
                MsgLog.c(c.TAG, Integer.valueOf(this.d), "uploadAck", Integer.valueOf(arrayList.size()));
                String jSONArray2 = jSONArray.toString();
                a(this.d).a(jSONArray2, arrayList, new a(arrayList));
                MsgLog.a(c.TAG, Integer.valueOf(this.d), "reportAck data: ", jSONArray2);
            } catch (Exception e2) {
                MsgLog.c(c.TAG, Integer.valueOf(this.d), e2);
                this.c = true;
            }
            this.c = false;
        }
    }
}
