package com.taobao.mediaplay;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRE_DOWNLOAD_FINISH = 1;
    public static final int PRE_DOWNLOAD_PROGRESS = 2;

    /* renamed from: a  reason: collision with root package name */
    private static volatile m f18042a;
    private Handler b = new Handler(Looper.getMainLooper()) { // from class: com.taobao.mediaplay.m.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                m.a(m.this, (String) message.obj, message.arg1);
            } else if (i != 2) {
            } else {
                m.b(m.this, (String) message.obj, message.arg1);
            }
        }
    };
    private Map<String, List<d>> c = new HashMap();
    private Map<String, String> d = new HashMap();
    private Map<String, String> e = new HashMap();

    static {
        kge.a(650241914);
    }

    public static /* synthetic */ void a(m mVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e68be5", new Object[]{mVar, str, new Integer(i)});
        } else {
            mVar.c(str, i);
        }
    }

    public static /* synthetic */ void b(m mVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb12dc4", new Object[]{mVar, str, new Integer(i)});
        } else {
            mVar.d(str, i);
        }
    }

    private m() {
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c8455a", new Object[0]);
        }
        if (f18042a == null) {
            synchronized (m.class) {
                if (f18042a == null) {
                    f18042a = new m();
                }
            }
        }
        return f18042a;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.sendMessage(Message.obtain(this.b, 1, i, 0, str));
        }
    }

    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.sendMessage(Message.obtain(this.b, 2, i, 0, str));
        }
    }

    private synchronized void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926cacf", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            if (this.c.containsKey(str)) {
                for (d dVar : this.c.get(str)) {
                    dVar.a(i);
                }
            }
            this.c.remove(str);
        }
        c(str);
    }

    private synchronized void d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752859ae", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && this.c.containsKey(str)) {
                for (d dVar : this.c.get(str)) {
                    dVar.b(i);
                }
            }
        } catch (AbstractMethodError unused) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "IPreDownloadListener has't onProgress method");
        }
    }

    public synchronized void a(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55903d1", new Object[]{this, str, str2, dVar});
            return;
        }
        if (!StringUtils.isEmpty(str) && dVar != null) {
            List<d> list = this.c.get(str);
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(dVar);
            this.c.put(str, list);
            this.d.put(str2, str);
            this.e.put(str, str2);
        }
    }

    public synchronized String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || !this.d.containsKey(str)) {
            return null;
        } else {
            return this.d.get(str);
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str) && this.d.containsKey(str)) {
            String str2 = this.d.get(str);
            this.d.remove(str);
            if (!StringUtils.isEmpty(str)) {
                this.e.remove(str2);
            }
        }
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str) && this.e.containsKey(str)) {
            String str2 = this.e.get(str);
            this.e.remove(str);
            if (!StringUtils.isEmpty(str2)) {
                this.d.remove(str2);
            }
        }
    }
}
