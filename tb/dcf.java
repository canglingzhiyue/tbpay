package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.Comparator;

/* loaded from: classes.dex */
public class dcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static dcf c;
    public static final Comparator<dch> comparator;

    /* renamed from: a  reason: collision with root package name */
    private final dcg f26675a = new dcg();
    private final Handler b;

    public static /* synthetic */ dcg a(dcf dcfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dcg) ipChange.ipc$dispatch("730830ed", new Object[]{dcfVar}) : dcfVar.f26675a;
    }

    static {
        kge.a(-421055736);
        comparator = new Comparator<dch>() { // from class: tb.dcf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(dch dchVar, dch dchVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, dchVar, dchVar2})).intValue() : a(dchVar, dchVar2);
            }

            public int a(dch dchVar, dch dchVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10ce7169", new Object[]{this, dchVar, dchVar2})).intValue() : dchVar.f() - dchVar2.f();
            }
        };
        c = null;
    }

    public static dcf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcf) ipChange.ipc$dispatch("f039a37", new Object[0]);
        }
        if (c == null) {
            synchronized (dcf.class) {
                if (c == null) {
                    c = new dcf();
                }
            }
        }
        return c;
    }

    private dcf() {
        HandlerThread handlerThread = new HandlerThread("ACCS-SyncManager");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: tb.dcf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                String str;
                String str2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
                }
                int i = message.what;
                Bundle data = message.getData();
                if (data != null) {
                    String string = data.getString("scv_id");
                    str = data.getString(Constants.KEY_STREAM_ID);
                    str2 = string;
                } else {
                    str = null;
                    str2 = null;
                }
                switch (i) {
                    case 1:
                        dcf.a(dcf.this).a((dch) message.obj);
                        break;
                    case 2:
                        dcf.a(dcf.this).b((dch) message.obj);
                        break;
                    case 3:
                        dcf.a(dcf.this).a(str2, null, data.getInt("start_seq"), data.getInt("snap_interval"), data.getLong("timeout"), data.getBoolean("saveDB"), (dce) message.obj);
                        break;
                    case 4:
                        dcf.a(dcf.this).a(str2, (String) null);
                        break;
                    case 5:
                        dcf.a(dcf.this).a(str2);
                        break;
                    case 6:
                        dcf.a(dcf.this).a(str2, str, data.getInt("start_seq"), data.getInt("end_seq"));
                        break;
                    case 7:
                        dcf.a(dcf.this).b(str2, str);
                        break;
                }
                return true;
            }
        });
    }

    public void a(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dcea6f", new Object[]{this, dchVar});
        } else {
            Message.obtain(this.b, 1, dchVar).sendToTarget();
        }
    }

    public void b(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35ff0f0", new Object[]{this, dchVar});
        } else {
            Message.obtain(this.b, 2, dchVar).sendToTarget();
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Message message = new Message();
        message.what = 5;
        Bundle bundle = new Bundle();
        bundle.putString("scv_id", str);
        message.setData(bundle);
        this.b.sendMessage(message);
    }

    public void a(String str, String str2, int i, int i2, long j, boolean z, dce dceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1242956", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j), new Boolean(z), dceVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            dcl.a("SyncManager", "subscribeStream() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 3;
            message.obj = dceVar;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putInt("start_seq", i);
            bundle.putInt("snap_interval", i2);
            bundle.putLong("timeout", j);
            bundle.putBoolean("saveDB", z);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            dcl.a("SyncManager", "unSubscribeStream() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 4;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69987edc", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || i > i2) {
            dcl.a("SyncManager", "query() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 6;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putString(Constants.KEY_STREAM_ID, str2);
            bundle.putInt("start_seq", i);
            bundle.putInt("end_seq", i2);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            dcl.a("SyncManager", "recover() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 7;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putString(Constants.KEY_STREAM_ID, str2);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f26675a.b(str);
        }
        return false;
    }
}
