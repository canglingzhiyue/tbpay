package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogz;

/* loaded from: classes5.dex */
public class y implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(414463327);
        kge.a(1288878174);
    }

    public static /* synthetic */ boolean a(y yVar, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fee9f004", new Object[]{yVar, str, str2, obj})).booleanValue() : yVar.b(str, str2, obj);
    }

    public static /* synthetic */ boolean a(y yVar, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d7dc025", new Object[]{yVar, str, bArr})).booleanValue() : yVar.b(str, bArr);
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13162a;
        public int b;
        public Object c;
        public int d;

        static {
            kge.a(307483943);
        }

        private a() {
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void a(final String str, final String str2, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{this, str, str2, obj});
        } else if (StringUtils.isEmpty(str2)) {
            ogg.b("putCache key is empty");
        } else if ("file".equals(str)) {
            if (obj instanceof byte[]) {
                a(str2, (byte[]) obj);
                return;
            }
            ogg.b("value is not byte[], key: " + str2);
        } else {
            ogg.a("putCache with  key:" + str2 + " type:" + str);
            AsyncTask.execute(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.y.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        y.a(y.this, str, str2, obj);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            a("config", str, obj);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void a(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
        } else if (StringUtils.isEmpty(str)) {
            ogg.b("saveFile fileName is empty");
        } else {
            ogg.a("saveFile with  fileName:" + str);
            AsyncTask.execute(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.y.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        y.a(y.this, str, bArr);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        File c = c("file");
        if (c == null) {
            return null;
        }
        return new File(c, str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a("config", str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c254b136", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            ogg.b("getCache key is empty");
            return null;
        } else if ("file".equals(str)) {
            File a2 = a(str2);
            if (a2 != null) {
                try {
                    byte[] a3 = oec.a((InputStream) new FileInputStream(a2));
                    ogg.a("getCache success with key:" + str2 + " type: " + str);
                    return a3;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            ogg.a("getCache failed with key:" + str2 + " type: " + str);
            return null;
        } else {
            a c = c(str, str2);
            if (c.d == 0) {
                ogg.a("getCache " + str2 + " success with key " + str2 + " type: " + str);
                return c.c;
            }
            ogg.a("getCache " + str2 + " failed for " + a(c.d));
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            ogg.b("removeCache failed, key is empty, type: " + str);
            return false;
        }
        File c = c(str);
        if (c == null) {
            return false;
        }
        boolean b = b(c, "file".equals(str) ? str2 : ogz.a(str2));
        ogg.b("removeCache success:" + b + " key: " + str2 + " type: " + str);
        return b;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        a("config", j);
        a(IStorage.TYPE_DSL, j);
        return true;
    }

    private void a(String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        final File c = c(str);
        if (c == null) {
            return;
        }
        AsyncTask.execute(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.y.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ogg.a("clearExpiredCache :" + j);
                for (File file : c.listFiles()) {
                    if (file != null && file.isFile()) {
                        long lastModified = file.lastModified();
                        if (lastModified > 0 && System.currentTimeMillis() - lastModified > j) {
                            ogg.a("clearExpiredCache, cache " + file.getName() + " is deleted");
                            file.delete();
                        }
                    }
                }
            }
        });
    }

    private a c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1f8e8f49", new Object[]{this, str, str2});
        }
        File c = c(str);
        if (c == null) {
            ogg.b("readObject failed for ensureDir,  key:" + str2);
            a aVar = new a();
            aVar.d = 1;
            return aVar;
        }
        return a(c, str2);
    }

    private boolean b(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55cf631d", new Object[]{this, str, str2, obj})).booleanValue();
        }
        File c = c(str);
        if (c == null) {
            ogg.b("saveObject failed for ensureDir,  key:" + str2 + "  value:" + obj);
            return false;
        }
        return a(c, str2, obj);
    }

    private boolean b(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278ac97e", new Object[]{this, str, bArr})).booleanValue();
        }
        File c = c("file");
        if (c == null) {
            ogg.b("saveFile failed for ensureFileDir,  fileName:" + str);
            return false;
        } else if (bArr == null) {
            ogg.b("saveFile failed for file is null,  fileName:" + str);
            return false;
        } else {
            return a(c, str, bArr);
        }
    }

    private File c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str});
        }
        Context a2 = ab.a();
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1354792126) {
            if (hashCode != 99773) {
                if (hashCode == 3143036 && str.equals("file")) {
                    c = 2;
                }
            } else if (str.equals(IStorage.TYPE_DSL)) {
                c = 1;
            }
        } else if (str.equals("config")) {
            c = 0;
        }
        String str2 = "tnode_storage_cache";
        if (c != 0) {
            if (c == 1) {
                str2 = "tnode_storage_dsl";
            } else if (c != 2) {
                ogg.b("unknown storage type: " + str);
            } else {
                str2 = "tnode_storage_file";
            }
        }
        File file = new File(a2.getFilesDir(), str2);
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file.isDirectory()) {
            return null;
        }
        return file;
    }

    private boolean a(File file, String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39084e74", new Object[]{this, file, str, bArr})).booleanValue();
        }
        File file2 = new File(file, str);
        File file3 = new File(file, str + ".bak");
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file3.exists()) {
                file3.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file3);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            boolean renameTo = file3.renameTo(file2);
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return renameTo;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                ogg.b("writeFile exception " + th.getMessage() + " fileName:" + str);
                return false;
            } finally {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private boolean a(File file, String str, Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9875789", new Object[]{this, file, str, obj})).booleanValue();
        }
        String a2 = ogz.a(str);
        File file2 = new File(file, a2);
        File file3 = new File(file, a2 + ".bak");
        try {
            if (!file3.exists()) {
                file3.createNewFile();
            }
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file3));
        } catch (Throwable th2) {
            objectOutputStream = null;
            th = th2;
        }
        try {
            objectOutputStream.writeByte(1);
            if (obj instanceof JSON) {
                objectOutputStream.writeByte(2);
                objectOutputStream.writeObject(JSON.toJSONString(obj));
            } else {
                objectOutputStream.writeByte(1);
                objectOutputStream.writeObject(obj);
            }
            objectOutputStream.flush();
            boolean renameTo = file3.renameTo(file2);
            ogg.b("writeFile success: " + renameTo + " key:" + str);
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return renameTo;
        } catch (Throwable th3) {
            th = th3;
            try {
                ogg.b("writeFile exception " + th.getMessage() + " key:" + str + " value:" + obj);
                return false;
            } finally {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private a a(File file, String str) {
        Object readObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c74f4af4", new Object[]{this, file, str});
        }
        String a2 = ogz.a(str);
        ObjectInputStream objectInputStream = null;
        a aVar = new a();
        File file2 = new File(file, a2);
        try {
            if (file2.exists()) {
                try {
                    try {
                        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(file2));
                        try {
                            aVar.f13162a = objectInputStream2.readByte();
                            aVar.b = objectInputStream2.readByte();
                            if (aVar.b == 2) {
                                readObject = JSON.parse((String) objectInputStream2.readObject());
                            } else {
                                readObject = objectInputStream2.readObject();
                            }
                            aVar.c = readObject;
                            aVar.d = 0;
                            objectInputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            objectInputStream = objectInputStream2;
                            aVar.d = 2;
                            ogg.b("readFile key:" + str + " exception:" + e.getMessage());
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            return aVar;
                        } catch (Throwable th) {
                            th = th;
                            objectInputStream = objectInputStream2;
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } else {
                aVar.d = 3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return aVar;
    }

    private boolean b(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366036e", new Object[]{this, file, str})).booleanValue();
        }
        ogg.b("deleteFile key: " + str);
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return false;
        }
        file2.delete();
        return true;
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "FLAG_VALID";
        }
        if (i == 1) {
            return "FLAG_DIR_NOT_EXIST";
        }
        if (i == 2) {
            return "FLAG_EXCEPTION";
        }
        if (i == 3) {
            return "FLAG_FILE_NOT_EXIST";
        }
        return "" + i;
    }
}
