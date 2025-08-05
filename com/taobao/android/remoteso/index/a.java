package com.taobao.android.remoteso.index;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import tb.ijb;
import tb.ijd;
import tb.ikq;
import tb.ikt;
import tb.ikw;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4f3c76", new Object[]{soFileInfo});
        } else if (ikw.a((CharSequence) soFileInfo.getMd5())) {
            throw RSoException.error(2003, soFileInfo.toString());
        } else {
            if (ikw.a((CharSequence) soFileInfo.getUri())) {
                throw RSoException.error(2004, soFileInfo.toString());
            }
        }
    }

    public static <T> List<T> a(Application application, ijd ijdVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e16386d8", new Object[]{application, ijdVar, str, cls});
        }
        try {
            List<T> parseArray = JSON.parseArray(ijb.a(ijdVar, str), cls);
            if (parseArray != null) {
                return parseArray;
            }
            byte[] a2 = ikt.a(application, str);
            if (a2 == null) {
                throw new IllegalStateException("bytes from assets/ got null, key = " + str + ", clz = " + cls);
            }
            List<T> parseArray2 = JSON.parseArray(new String(a2), cls);
            if (parseArray2 != null) {
                return parseArray2;
            }
            throw new IllegalStateException("parse data got null, key = " + str + ", clz = " + cls);
        } catch (Throwable th) {
            ikq.a("index -> key = " + str + ", clz = " + cls, th);
            return null;
        }
    }

    public static <T> T b(Application application, ijd ijdVar, String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6eaac6a2", new Object[]{application, ijdVar, str, cls});
        }
        T t2 = (T) ijb.a(ijdVar, str, cls);
        if (t2 != null) {
            RSoLog.c("index -> readData from config");
            return t2;
        } else if (ijdVar.a("key_codegen_index_enabled", true) && (t = (T) d.a(str, cls)) != null) {
            RSoLog.c("index -> readData from IndexBuilderOpt");
            return t;
        } else {
            try {
                byte[] a2 = ikt.a(application, str);
                if (a2 == null) {
                    throw new IllegalStateException("bytes from assets/ got null, key = " + str + ", clz = " + cls);
                }
                T t3 = (T) JSON.parseObject(a2, cls, new Feature[0]);
                if (t3 == null) {
                    throw new IllegalStateException("parse data got null, key = " + str + ", clz = " + cls);
                }
                RSoLog.c("index -> readData from assets");
                return t3;
            } catch (Throwable th) {
                ikq.a("index -> key = " + str + ", clz = " + cls, th);
                return null;
            }
        }
    }
}
