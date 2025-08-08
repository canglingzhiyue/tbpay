package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ldx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, ISubService> f30512a = new HashMap<>(64);
    private final HashMap<Class, String> b = new HashMap<>(64);

    static {
        kge.a(793358030);
    }

    public void a(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (ISubService iSubService : list) {
            String b = b(iSubService.getClass());
            if (!StringUtils.isEmpty(b)) {
                this.f30512a.put(b, iSubService);
            }
        }
    }

    public void a(lcs lcsVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be80c46d", new Object[]{this, lcsVar, list});
            return;
        }
        ldf.d("SubServiceManager", "服务总数：" + this.f30512a.size());
        a(this.f30512a, list);
        for (String str : list) {
            ISubService iSubService = this.f30512a.get(str);
            if (iSubService == null) {
                a("异常，未注册服务：" + str, new NullPointerException());
            } else {
                a(str, iSubService, lcsVar);
            }
        }
        for (Map.Entry<String, ISubService> entry : this.f30512a.entrySet()) {
            if (!list.contains(entry.getKey())) {
                a(entry.getKey(), entry.getValue(), lcsVar);
            }
        }
    }

    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1eb717ab", new Object[]{this, cls});
        }
        if (!cls.isInterface()) {
            ldf.d("SubServiceManager", "findSubService error, classType 必须为 interface");
            return null;
        }
        String b = b(cls);
        if (!StringUtils.isEmpty(b)) {
            T t = (T) this.f30512a.get(b);
            if (!cls.isInstance(t)) {
                return null;
            }
            return t;
        }
        ldf.d("SubServiceManager", "不是符合服务定义，缺少 SERVICE_NAME 声明： " + cls.getSimpleName());
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ISubService> entry : this.f30512a.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
        this.f30512a.clear();
    }

    private void a(String str, ISubService iSubService, lcs lcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67240148", new Object[]{this, str, iSubService, lcsVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            iSubService.onCreateService(new lct(lcsVar, iSubService.getClass()));
        } catch (Exception unused) {
            ljc.a(new ljb("infoFlow", "subServiceCreate", 3005, "sub service create failed", "子服务创建发生crash , serviceName: " + str + ", subService : " + iSubService));
        }
        ldf.d("SubServiceManager", "创建服务: " + str + ", 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
    }

    private void a(String str, ISubService iSubService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeac4a34", new Object[]{this, str, iSubService});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        iSubService.onDestroyService();
        ldf.d("SubServiceManager", "销毁服务: " + str + ", 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
    }

    private void a(HashMap<String, ISubService> hashMap, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26533c", new Object[]{this, hashMap, list});
            return;
        }
        for (String str : list) {
            if (!hashMap.containsKey(str)) {
                a("子服务：" + str + " 必须注册！", (Throwable) null);
            }
        }
    }

    private String b(Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c798a8ac", new Object[]{this, cls});
        }
        String str = this.b.get(cls);
        if (str != null) {
            return str;
        }
        String c = c(cls);
        this.b.put(cls, c);
        return c;
    }

    private String c(Class<? extends ISubService> cls) {
        try {
            Object obj = cls.getField("SERVICE_NAME").get(null);
            if (!(obj instanceof String)) {
                a("服务：" + cls.getSimpleName() + " SERVICE_NAME 不是字符串类型！", (Throwable) null);
                return null;
            }
            String str = (String) obj;
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
            a("服务：" + cls.getSimpleName() + " SERVICE_NAME 为空字符串！", (Throwable) null);
            return null;
        } catch (IllegalAccessException e) {
            a("服务：" + cls.getSimpleName() + " SERVICE_NAME 不是对象！", e);
            return null;
        } catch (NoSuchFieldException e2) {
            a("服务：" + cls.getSimpleName() + " 未声明服务名称！", e2);
            return null;
        }
    }

    private void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
        } else if (lcz.b()) {
            if (th != null) {
                th.printStackTrace();
            }
            throw new IllegalArgumentException(str);
        } else {
            ldf.a("SubServiceManager", str, th);
        }
    }
}
