package com.taobao.themis.open.ability.file;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.utils.i;
import com.taobao.themis.utils.io.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.bte;
import tb.kge;
import tb.tlk;
import tb.tll;
import tb.toh;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020$2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006*"}, d2 = {"Lcom/taobao/themis/open/ability/file/FSManagerBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", bte.TAG_ACCESS, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "params", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "convertEncoding", "", "encoding", com.alibaba.alibity.container.file.a.API_COPY_FILE, "fsManage", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, "getSavedFileList", "mkdir", "onFinalized", "onInitialized", "readDir", "readFile", "removeSavedFile", com.alibaba.alibity.container.file.a.API_RENAME, "rmdir", "saveFile", "stat", "stats", "Lcom/alibaba/fastjson/JSONArray;", "root", "Ljava/io/File;", "current", "recursive", "", "unlink", com.alibaba.alibity.container.file.a.API_UNZIP, com.alibaba.alibity.container.file.a.API_WRITE_FILE, "append", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class FSManagerBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1255826358);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void fsManage(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject params, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c131a2", new Object[]{this, apiContext, params, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(params, "params");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        String a2 = i.a(params, "action");
        String str = a2;
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "fsManage action is null or empty");
        } else if (a2 == null) {
        } else {
            switch (a2.hashCode()) {
                case -2139808842:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_APPEND_FILE)) {
                        return;
                    }
                    a(c, params, true, bridgeCallback);
                    return;
                case -2073025383:
                    if (!a2.equals("saveFile")) {
                        return;
                    }
                    f(c, params, bridgeCallback);
                    return;
                case -1995982721:
                    if (!a2.equals("removeSavedFile")) {
                        return;
                    }
                    h(c, params, bridgeCallback);
                    return;
                case -1851124693:
                    if (!a2.equals("getSavedFileList")) {
                        return;
                    }
                    g(c, params, bridgeCallback);
                    return;
                case -1423461020:
                    if (!a2.equals(bte.TAG_ACCESS)) {
                        return;
                    }
                    a(c, params, bridgeCallback);
                    return;
                case -1406748165:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_WRITE_FILE)) {
                        return;
                    }
                    a(c, params, false, bridgeCallback);
                    return;
                case -934594754:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_RENAME)) {
                        return;
                    }
                    k(c, params, bridgeCallback);
                    return;
                case -867956686:
                    if (!a2.equals("readFile")) {
                        return;
                    }
                    b(c, params, bridgeCallback);
                    return;
                case -840447469:
                    if (!a2.equals("unlink")) {
                        return;
                    }
                    n(c, params, bridgeCallback);
                    return;
                case -506374511:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_COPY_FILE)) {
                        return;
                    }
                    l(c, params, bridgeCallback);
                    return;
                case 3540564:
                    if (!a2.equals("stat")) {
                        return;
                    }
                    e(c, params, bridgeCallback);
                    return;
                case 103950895:
                    if (!a2.equals("mkdir")) {
                        return;
                    }
                    i(c, params, bridgeCallback);
                    return;
                case 108628082:
                    if (!a2.equals("rmdir")) {
                        return;
                    }
                    j(c, params, bridgeCallback);
                    return;
                case 111449576:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_UNZIP)) {
                        return;
                    }
                    d(c, params, bridgeCallback);
                    return;
                case 1080408887:
                    if (!a2.equals("readdir")) {
                        return;
                    }
                    c(c, params, bridgeCallback);
                    return;
                case 1342041536:
                    if (!a2.equals(com.alibaba.alibity.container.file.a.API_GET_FILE_INFO)) {
                        return;
                    }
                    m(c, params, bridgeCallback);
                    return;
                default:
                    return;
            }
        }
    }

    private final void a(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8797479", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "path");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        b.INSTANCE.a(fVar, a2, bridgeCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.taobao.themis.kernel.f r10, com.alibaba.fastjson.JSONObject r11, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.file.FSManagerBridge.b(com.taobao.themis.kernel.f, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = str;
        return StringUtils.isEmpty(str2) ? str : (StringUtils.equals(str2, "ucs2") || StringUtils.equals(str2, "ucs-2") || StringUtils.equals(str2, "utf16le") || StringUtils.equals(str2, "utf-16le")) ? "UTF-16LE" : str;
    }

    private final void c(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff7547b", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "dirPath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        b.INSTANCE.b(fVar, a2, bridgeCallback);
    }

    private final void d(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b6447c", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "zipFilePath");
        String a3 = i.a(jSONObject, "targetPath");
        String str = a3;
        if (!(str == null || str.length() == 0)) {
            String str2 = a2;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (!z) {
                b.INSTANCE.c(fVar, a2, a3, bridgeCallback);
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("FSManagerBridge", "zipFilePath[" + a2 + "] or targetPath[" + a3 + "]  is empty or null");
    }

    private final void e(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4775347d", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "path");
        q.b(a2, "TMSJSONUtils.getString(params, \"path\")");
        if (c.a(a2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        String a3 = toh.a(o.e(fVar), a2, null, 4, null);
        String str = a3;
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        File file = new File(a3);
        if (!file.exists()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(123, "文件不存在 " + a2));
        } else if (!file.canRead()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(123, "指定的 path 路径没有读权限 " + a2));
        } else {
            boolean a4 = i.a(jSONObject, "recursive", false);
            JSONArray jSONArray = new JSONArray();
            a(jSONArray, file, file, a4);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "success", (String) true);
            if (a4 && file.isDirectory()) {
                jSONObject3.put((JSONObject) "stats", (String) jSONArray);
            } else if (jSONArray.size() > 0) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                jSONObject4.remove("path");
                jSONObject3.put((JSONObject) "stats", (String) jSONObject4);
            }
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    private final void a(JSONArray jSONArray, File file, File file2, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c12d656", new Object[]{this, jSONArray, file, file2, new Boolean(z)});
            return;
        }
        String path = file2.getPath();
        q.b(path, "current.path");
        int length = file.getPath().length();
        if (path == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = path.substring(length);
        q.b(substring, "(this as java.lang.String).substring(startIndex)");
        boolean isDirectory = file2.isDirectory();
        boolean isFile = file2.isFile();
        tll a2 = tlk.a(file2.getPath());
        q.b(a2, "SafeLibCore.stat(current.path)");
        JSONObject jSONObject = new JSONObject();
        if (StringUtils.isEmpty(substring)) {
            if (file2.isDirectory()) {
                jSONObject.put((JSONObject) "path", "/");
            }
        } else {
            jSONObject.put((JSONObject) "path", substring);
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "mode", (String) Integer.valueOf(a2 != null ? a2.c : 0));
        long j = 0;
        jSONObject2.put((JSONObject) "size", (String) Long.valueOf(a2 != null ? a2.h : 0L));
        jSONObject2.put((JSONObject) "lastAccessedTime", (String) Long.valueOf(a2 != null ? a2.i : 0L));
        if (a2 != null) {
            j = a2.j;
        }
        jSONObject2.put((JSONObject) "lastModifiedTime", (String) Long.valueOf(j));
        jSONObject2.put((JSONObject) "is_directory", (String) Boolean.valueOf(isDirectory));
        jSONObject2.put((JSONObject) "is_file", (String) Boolean.valueOf(isFile));
        jSONArray.add(jSONObject);
        if (!z || !isDirectory || (listFiles = file2.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file3 : listFiles) {
            q.b(file3, "file");
            a(jSONArray, file, file3, z);
        }
    }

    public static /* synthetic */ void writeFile$default(FSManagerBridge fSManagerBridge, f fVar, JSONObject jSONObject, boolean z, BridgeCallback bridgeCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2ba684", new Object[]{fSManagerBridge, fVar, jSONObject, new Boolean(z), bridgeCallback, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        fSManagerBridge.a(fVar, jSONObject, z, bridgeCallback);
    }

    private final void a(f fVar, JSONObject jSONObject, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc60b44b", new Object[]{this, fVar, jSONObject, new Boolean(z), bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "filePath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (z2) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        String string = jSONObject.getString("data");
        if (string == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
            return;
        }
        String a3 = i.a(jSONObject, "encoding", "utf8");
        q.b(a3, "TMSJSONUtils.getString(params, \"encoding\", \"utf8\")");
        b.INSTANCE.a(fVar, a2, string, q.a((Object) jSONObject.getString("dataType"), (Object) "ArrayBuffer") ? "base64" : a3, z, bridgeCallback);
    }

    private final void f(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b34247e", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("tempFilePath");
        String str = string;
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "saveFile, tempFilePath is empty or null");
            return;
        }
        if (toh.a(string, fVar) != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "saveFile, only temp path is allowed to be saved");
        }
        String string2 = jSONObject.getString("filePath");
        String str2 = string2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            b.INSTANCE.d(fVar, string, "https://usr/saved/", bridgeCallback);
            return;
        }
        if (toh.a(string2, fVar) != ApPathType.AP_PATH_TYPE_USR) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "only usr path is allowed to be saved");
        }
        b.INSTANCE.d(fVar, string, string2, bridgeCallback);
    }

    private final void g(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3147f", new Object[]{this, fVar, jSONObject, bridgeCallback});
        } else {
            b.INSTANCE.c(fVar, "https://usr/saved/", bridgeCallback);
        }
    }

    private final void h(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b20480", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("filePath");
        String str = string;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "removeSavedFile, filePath is empty or null");
            return;
        }
        ApPathType a2 = toh.a(string, fVar);
        if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "removeSavedFile, param is invalid! only handle usr/temp path");
            return;
        }
        b.INSTANCE.d(fVar, string, bridgeCallback);
    }

    private final void i(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d670f481", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "dirPath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        b.INSTANCE.a(fVar, a2, i.a(jSONObject, "recursive", false), bridgeCallback);
    }

    private final void j(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2fe482", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "dirPath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        b.INSTANCE.b(fVar, a2, i.a(jSONObject, "recursive", false), bridgeCallback);
    }

    private final void k(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9deed483", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("oldPath");
        String str = string;
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        if (toh.a(string, fVar) != ApPathType.AP_PATH_TYPE_USR) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "param is invalid! only handle usr path");
        }
        String string2 = jSONObject.getString("newPath");
        String str2 = string2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "newPath is empty or null");
            return;
        }
        ApPathType a2 = toh.a(string2, fVar);
        if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "param is invalid! only handle usr/tmp path");
        }
        b.INSTANCE.f(fVar, string, string2, bridgeCallback);
    }

    private final void l(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81adc484", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("srcPath");
        String str = string;
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        ApPathType a2 = toh.a(string, fVar);
        if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "param is invalid! only handle usr/tmp path");
        }
        String string2 = jSONObject.getString("destPath");
        String str2 = string2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        if (toh.a(string2, fVar) != ApPathType.AP_PATH_TYPE_USR) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("FSManagerBridge", "param is invalid! only handle usr path");
        }
        b.INSTANCE.b(fVar, string, string2, bridgeCallback);
    }

    private final void m(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656cb485", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "filePath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        String digestAlgorithm = i.a(jSONObject, "digestAlgorithm");
        b bVar = b.INSTANCE;
        q.b(digestAlgorithm, "digestAlgorithm");
        bVar.e(fVar, a2, digestAlgorithm, bridgeCallback);
    }

    private final void n(f fVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492ba486", new Object[]{this, fVar, jSONObject, bridgeCallback});
            return;
        }
        String a2 = i.a(jSONObject, "filePath");
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("FSManagerBridge", "path is empty or null");
            return;
        }
        b.INSTANCE.d(fVar, a2, bridgeCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/open/ability/file/FSManagerBridge$Companion;", "", "()V", "ACTION_ACCESS", "", "ACTION_APPEND_FILE", "ACTION_COPY_FILE", "ACTION_GET_FILE_INFO", "ACTION_GET_SAVED_FILE_LIST", "ACTION_MKDIR", "ACTION_READ_DIR", "ACTION_READ_FILE", "ACTION_REMOVE_SAVED_FILE", "ACTION_RENAME", "ACTION_RMDIR", "ACTION_SAVE_FILE", "ACTION_STAT", "ACTION_UNLINK", "ACTION_UNZIP", "ACTION_WRITE_FILE", "ENCODING_BASE64", "ENCODING_BINARY", "ENCODING_HEX", RPCDataItems.SWITCH_TAG_LOG, "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(796799762);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
