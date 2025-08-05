package com.taobao.android.cachecleaner.monitor.info;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.dvq;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<InterfaceC0360b> f9288a = new ArrayList();
    private final List<a> b = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(File file, com.taobao.android.cachecleaner.monitor.info.node.a aVar, long j);
    }

    /* renamed from: com.taobao.android.cachecleaner.monitor.info.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0360b {
        void a(File file, com.taobao.android.cachecleaner.monitor.info.node.a aVar);
    }

    static {
        kge.a(-785892496);
    }

    public void a(InterfaceC0360b interfaceC0360b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c60b3b", new Object[]{this, interfaceC0360b});
        } else {
            this.f9288a.add(interfaceC0360b);
        }
    }

    public void b(InterfaceC0360b interfaceC0360b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621a607c", new Object[]{this, interfaceC0360b});
        } else {
            this.f9288a.remove(interfaceC0360b);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c596dc", new Object[]{this, aVar});
        } else {
            this.b.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6219ec1d", new Object[]{this, aVar});
        } else {
            this.b.remove(aVar);
        }
    }

    public com.taobao.android.cachecleaner.monitor.info.node.a a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.cachecleaner.monitor.info.node.a) ipChange.ipc$dispatch("2ff11382", new Object[]{this, file, str});
        }
        FileNode fileNode = new FileNode(str, file);
        a(file, fileNode);
        return fileNode;
    }

    public long a(File file, com.taobao.android.cachecleaner.monitor.info.node.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f4b399e", new Object[]{this, file, aVar})).longValue();
        }
        if (file == null) {
            Log.e("CacheVisitor", "visit: rootFile is empty!");
            return 0L;
        }
        return a(file, aVar, 0);
    }

    private long a(File file, com.taobao.android.cachecleaner.monitor.info.node.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a1c6e8d", new Object[]{this, file, aVar, new Integer(i)})).longValue();
        }
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (i > com.taobao.android.cachecleaner.monitor.config.a.a().b().getMaxDeepLevel()) {
                    TLog.loge(CacheCleaner.MODULE, "CacheVisitor", "traversal: too deep, info node" + aVar);
                    return j;
                }
                FileNode fileNode = new FileNode(aVar, file2);
                j += a(file2, fileNode, i + 1);
                aVar.addChild(fileNode);
            }
            aVar.setSize(j);
            for (a aVar2 : this.b) {
                aVar2.a(file, aVar, j);
            }
            return j;
        }
        for (InterfaceC0360b interfaceC0360b : this.f9288a) {
            interfaceC0360b.a(file, aVar);
        }
        if (com.taobao.android.cachecleaner.monitor.config.a.a().b().getEnableSymbolicLink() && i < com.taobao.android.cachecleaner.monitor.config.a.a().b().getSoftLinkCheckMaxDepth() && dvq.b(file)) {
            return 0L;
        }
        return file.length();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.f9288a.clear();
        this.b.clear();
        super.finalize();
    }
}
