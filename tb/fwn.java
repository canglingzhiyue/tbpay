package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class fwn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static File b;

    /* renamed from: a  reason: collision with root package name */
    private final LruCache<String, byte[]> f28165a = new LruCache<>(100);

    static {
        kge.a(-1512298525);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : fxb.ASSET_DIR;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fwn f28166a;
        private static fwn b;

        public static /* synthetic */ fwn a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwn) ipChange.ipc$dispatch("f04cf01", new Object[0]) : b;
        }

        public static /* synthetic */ fwn a(fwn fwnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fwn) ipChange.ipc$dispatch("9115f40e", new Object[]{fwnVar});
            }
            b = fwnVar;
            return fwnVar;
        }

        public static /* synthetic */ fwn b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwn) ipChange.ipc$dispatch("16b67460", new Object[0]) : f28166a;
        }

        static {
            kge.a(-1880773962);
            f28166a = new fwn();
            b = null;
        }
    }

    public static fwn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fwn) ipChange.ipc$dispatch("f04cf01", new Object[0]) : (!DinamicXEngine.j() || a.a() == null) ? a.b() : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (context == null) {
            fux.b("DinamicX_File", "DXFileManager", "context is null");
        }
        File file = b;
        if (file != null && file.exists()) {
            return;
        }
        File file2 = new File(context.getFilesDir(), fxb.DEFAULT_ROOT_DIR);
        b = file2;
        if (file2.exists() || b.mkdirs()) {
            return;
        }
        b.mkdirs();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        File file = b;
        return file == null ? "" : file.getAbsolutePath();
    }

    public byte[] a(String str, DXRuntimeContext dXRuntimeContext) {
        List<s.a> list;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("40a9e11a", new Object[]{this, str, dXRuntimeContext});
        }
        long nanoTime = System.nanoTime();
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            synchronized (this.f28165a) {
                bArr = this.f28165a.get(str);
                if ((bArr == null || bArr.length == 0) && (bArr = c.a(str)) != null && bArr.length > 0) {
                    this.f28165a.put(str, bArr);
                }
                a(DXMonitorConstant.DX_MONITOR_TEMPLATE_READ, System.nanoTime() - nanoTime);
            }
            return bArr;
        } catch (IOException e) {
            if (dXRuntimeContext == null || dXRuntimeContext.n() == null || (list = dXRuntimeContext.n().c) == null) {
                return null;
            }
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_TEMPLATE, DXMonitorConstant.DX_MONITOR_TEMPLATE_READ, s.DX_TEMPLATE_IO_READ_ERROR);
            if (e instanceof FileNotFoundException) {
                aVar.e = "fileNotFound " + str;
            } else {
                aVar.e = str + " " + com.taobao.android.dinamicx.exception.a.a(e);
            }
            fux.b(aVar.e);
            list.add(aVar);
            return null;
        }
    }

    public boolean a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{this, str, bArr})).booleanValue() : a(str, bArr, true);
    }

    public boolean a(String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7f5c57f", new Object[]{this, str, bArr, new Boolean(z)})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        boolean a2 = c.a(str, bArr, z);
        if (a2) {
            a(DXMonitorConstant.DX_MONITOR_TEMPLATE_WRITE, System.nanoTime() - nanoTime);
        }
        if (!a2) {
            fux.b("文件写入失败 " + str);
        }
        return a2;
    }

    public void b(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278ac97a", new Object[]{this, str, bArr});
        } else if (StringUtils.isEmpty(str) || bArr == null) {
        } else {
            synchronized (this.f28165a) {
                if (this.f28165a.get(str) != null) {
                    return;
                }
                this.f28165a.put(str, bArr);
            }
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.f28165a.snapshot().containsKey(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.f28165a) {
                this.f28165a.remove(str);
            }
        }
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            b.a(2, "DinamicX_File", DXMonitorConstant.DX_MONITOR_TEMPLATE, str, (DXTemplateItem) null, (Map<String, String>) null, j, true);
        }
    }

    public static void a(fwn fwnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9632bfb", new Object[]{fwnVar});
        } else if (a.a() != null) {
        } else {
            a.a(fwnVar);
        }
    }

    public JSONObject b(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6e34ec4", new Object[]{this, str, dXRuntimeContext});
        }
        byte[] a2 = a(str, dXRuntimeContext);
        if (a2 != null && a2.length != 0) {
            return JSON.parseObject(new String(a2));
        }
        return null;
    }
}
