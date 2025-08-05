package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import com.taobao.tao.homepage.d;

/* loaded from: classes7.dex */
public class kyo implements kyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kyp f30403a = new kyp();
    private final kyq b = new kyq();

    static {
        kge.a(-609445779);
        kge.a(-1631616540);
    }

    @Override // tb.kyn
    public void a(String str, String str2, String str3, TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df74fa8d", new Object[]{this, str, str2, str3, tbHRLogModel});
        } else if (!a()) {
            ldf.d("TbHRLogSubscribe", "不允许上传数据");
        } else {
            a(tbHRLogModel);
            this.b.a(str, str2, str3, this.f30403a);
        }
    }

    private void a(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6650aaf", new Object[]{this, tbHRLogModel});
            return;
        }
        String logType = tbHRLogModel.getLogType();
        if (logType.equals("investigate") && c()) {
            this.f30403a.a(tbHRLogModel);
        }
        if (!logType.equals("monitor") || !b()) {
            return;
        }
        this.f30403a.b(tbHRLogModel);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return (c() || b()) && !this.b.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d("TbHRLogSubscribe", "isOpenRealTimeMonitor ext == null");
            return false;
        }
        return c.getBooleanValue("isOpenRealTimeMonitor");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d("TbHRLogSubscribe", "isOpenRealTimeLog ext == null");
            return false;
        }
        return c.getBooleanValue("isOpenRealTimeLog");
    }
}
