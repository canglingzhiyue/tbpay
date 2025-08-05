package com.taobao.themis.open.ability.file;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qox;
import tb.qpv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ-\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ-\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020$2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/themis/open/ability/file/FileMegaAbility;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "module", "namespace", com.alibaba.alibity.container.file.a.API_APPEND_FILE, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "path", "data", "encoding", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", com.alibaba.alibity.container.file.a.API_COPY_FILE, "src", "dest", com.alibaba.alibity.container.file.a.API_EXISTS, com.alibaba.alibity.container.file.a.API_GET_DIR_INFO, com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, "digestAlgorithm", com.alibaba.alibity.container.file.a.API_MAKE_DIR, "recursive", "", "(Lcom/taobao/themis/kernel/TMSInstance;Ljava/lang/String;Ljava/lang/Boolean;Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;)V", "readAsArrayBuffer", com.alibaba.alibity.container.file.a.API_READ_AS_STRING, com.alibaba.alibity.container.file.a.API_REMOVE_DIR, com.alibaba.alibity.container.file.a.API_REMOVE_FILE, com.alibaba.alibity.container.file.a.API_RENAME, com.alibaba.alibity.container.file.a.API_UNZIP, "rootDir", com.alibaba.alibity.container.file.a.API_WRITE_FILE, "writeFileWithByteBuffer", "Ljava/nio/ByteBuffer;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(889958301);
        INSTANCE = new a();
    }

    private a() {
    }

    public final void a(f instance, String path, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88d81cd", new Object[]{this, instance, path, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "exists: path: " + path);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", path);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_EXISTS, jSONObject, callback);
    }

    public final void b(f instance, String path, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9434e8e", new Object[]{this, instance, path, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "getDirInfo: path: " + path);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", path);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_GET_DIR_INFO, jSONObject, callback);
    }

    public final void a(f instance, String path, Boolean bool, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ce9b4c", new Object[]{this, instance, path, bool, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "makeDir: path: " + path + ", recursive: " + bool);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        if (bool != null) {
            bool.booleanValue();
            jSONObject2.put((JSONObject) "recursive", (String) bool);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_MAKE_DIR, jSONObject, callback);
    }

    public final void b(f instance, String path, Boolean bool, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cfeceb", new Object[]{this, instance, path, bool, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "removeDir: path: " + path + ", recursive: " + bool);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        if (bool != null) {
            bool.booleanValue();
            jSONObject2.put((JSONObject) "recursive", (String) bool);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_REMOVE_DIR, jSONObject, callback);
    }

    public final void c(f instance, String path, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f91b4f", new Object[]{this, instance, path, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "readAsArrayBuffer: path: " + path);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", path);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_READ_AS_ARRAY_BUFFER, jSONObject, callback);
    }

    public final void a(f instance, String path, String str, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc61d7", new Object[]{this, instance, path, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "readAsString: path: " + path + ", encoding: " + str);
        qpv.b(instance, str == null ? "utf-8" : str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        if (str != null) {
            jSONObject2.put((JSONObject) "encoding", str);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_READ_AS_STRING, jSONObject, callback);
    }

    public final void b(f instance, String src, String dest, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ae058", new Object[]{this, instance, src, dest, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(src, "src");
        q.d(dest, "dest");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "copyFile: src: " + src + ", dest: " + dest);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "src", src);
        jSONObject2.put((JSONObject) "dest", dest);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_COPY_FILE, jSONObject, callback);
    }

    public final void a(f instance, String path, String data, String str, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bb1361", new Object[]{this, instance, path, data, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(data, "data");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "writeFileWithString: path: " + path + ", data size: " + data.length() + ", encoding: " + str);
        qpv.b(instance, str == null ? "utf-8" : str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        jSONObject2.put((JSONObject) "data", data);
        if (str != null) {
            jSONObject2.put((JSONObject) "encoding", str);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_WRITE_FILE, jSONObject, callback);
    }

    public final void a(f instance, String path, ByteBuffer data, String str, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9a8c5a", new Object[]{this, instance, path, data, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(data, "data");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "writeFileWithString: path: " + path + ", data size: " + data.capacity() + ", encoding: " + str);
        qpv.b(instance, str == null ? "ArrayBuffer" : str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        jSONObject2.put((JSONObject) "data", (String) data);
        if (str != null) {
            jSONObject2.put((JSONObject) "encoding", str);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_WRITE_FILE, jSONObject, callback);
    }

    public final void b(f instance, String path, String data, String str, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0153a2", new Object[]{this, instance, path, data, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(data, "data");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "appendFileWithString: path: " + path + ", data size: " + data.length() + ", encoding: " + str);
        qpv.b(instance, str == null ? "utf-8" : str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        jSONObject2.put((JSONObject) "data", data);
        if (str != null) {
            jSONObject2.put((JSONObject) "encoding", str);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_APPEND_FILE, jSONObject, callback);
    }

    public final void d(f instance, String path, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aaee810", new Object[]{this, instance, path, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "removeFile: path: " + path);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", path);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_REMOVE_FILE, jSONObject, callback);
    }

    public final void c(f instance, String path, String str, qox callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a695ed9", new Object[]{this, instance, path, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "getFileInfo: path: " + path + ", digestAlgorithm: " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "path", path);
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z) {
            jSONObject2.put((JSONObject) "digestAlgorithm", str);
        }
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, jSONObject, callback);
    }

    public final void d(f instance, String src, String dest, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37dd5a", new Object[]{this, instance, src, dest, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(src, "src");
        q.d(dest, "dest");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "rename: src: " + src + ", dest: " + dest);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "src", src);
        jSONObject2.put((JSONObject) "dest", dest);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_RENAME, jSONObject, callback);
    }

    public final void c(f instance, String src, String dest, String str, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444793e3", new Object[]{this, instance, src, dest, str, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(src, "src");
        q.d(dest, "dest");
        q.d(callback, "callback");
        TMSLogger.b("FileMegaAbility", "unzip: src: " + src + ", dest: " + dest);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "src", src);
        jSONObject2.put((JSONObject) "dest", dest);
        jSONObject2.put((JSONObject) "limitRootDicPath", str);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, null, null, "file", com.alibaba.alibity.container.file.a.API_UNZIP, jSONObject, callback);
    }
}
