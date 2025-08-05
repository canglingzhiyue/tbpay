package com.taobao.android.cachecleaner.monitor.info;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile CacheOverviewInfo f9287a;

    static {
        kge.a(-805322502);
    }

    public static void a(Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17661baa", new Object[]{context, cacheOverviewInfo});
            return;
        }
        try {
            try {
                a(context.getDir("cache_info", 0), "basic_info", JSON.toJSON(cacheOverviewInfo).toString());
            } finally {
                f9287a = cacheOverviewInfo;
            }
        } catch (Throwable unused) {
            TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "restoreBasicInfo: restore basic cache info failed!");
        }
    }

    public static void a(Context context, com.taobao.android.cachecleaner.monitor.info.node.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a733ed53", new Object[]{context, aVar, str});
            return;
        }
        File dir = context.getDir("cache_info", 0);
        try {
            String a2 = d.a(aVar);
            a(dir, str + "_cache_tree_info_v1", a2);
        } catch (Throwable unused) {
            TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "restoreCacheTreeInfo: restore " + str + " cache info failed.");
        }
    }

    public static CacheOverviewInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("5de5b901", new Object[]{context});
        }
        if (f9287a != null) {
            return f9287a;
        }
        CacheOverviewInfo a2 = a(context);
        f9287a = a2;
        return a2;
    }

    private static CacheOverviewInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("783a5c80", new Object[]{context});
        }
        try {
            String sb = a(context.getDir("cache_info", 0), "basic_info").toString();
            if (!TextUtils.isEmpty(sb)) {
                return (CacheOverviewInfo) JSON.parseObject(sb, CacheOverviewInfo.class);
            }
            return null;
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "quireBasicInfo: quire basic cache info failed, with exception " + th);
            return null;
        }
    }

    public static com.taobao.android.cachecleaner.monitor.info.node.a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.cachecleaner.monitor.info.node.a) ipChange.ipc$dispatch("11f92b43", new Object[]{context, str});
        }
        File dir = context.getDir("cache_info", 0);
        try {
            return d.a((String) null, a(dir, str + "_cache_tree_info_v1").toString());
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "quireBasicInfo: quire " + str + " cache info failed, with exception " + th);
            return null;
        }
    }

    private static void a(File file, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7089173", new Object[]{file, str, str2});
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file2));
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e);
                    }
                } catch (Exception e2) {
                    bufferedWriter = bufferedWriter2;
                    e = e2;
                    TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e);
                    if (bufferedWriter == null) {
                        return;
                    }
                    try {
                        bufferedWriter.close();
                    } catch (IOException e3) {
                        TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e3);
                    }
                } catch (Throwable th) {
                    bufferedWriter = bufferedWriter2;
                    th = th;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e4);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static StringBuilder a(File file, String str) {
        StringBuilder sb;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("61aded04", new Object[]{file, str});
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                file2 = new File(file, str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        if (!file2.exists()) {
            return sb2;
        }
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        while (true) {
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    try {
                        break;
                    } catch (IOException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("read: read file failed, file name: ");
                        sb.append(str);
                        sb.append(", with exception ");
                        sb.append(e);
                        TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", sb.toString());
                        return sb2;
                    }
                }
            } catch (Exception e3) {
                bufferedReader = bufferedReader2;
                e = e3;
                TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "read: read file failed, file name: " + str + ", with exception " + e);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e = e4;
                        sb = new StringBuilder();
                        sb.append("read: read file failed, file name: ");
                        sb.append(str);
                        sb.append(", with exception ");
                        sb.append(e);
                        TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", sb.toString());
                        return sb2;
                    }
                }
                return sb2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        TLog.loge(CacheCleaner.MODULE, "CacheInfoHelper", "read: read file failed, file name: " + str + ", with exception " + e5);
                    }
                }
                throw th;
            }
        }
        bufferedReader2.close();
        return sb2;
    }
}
