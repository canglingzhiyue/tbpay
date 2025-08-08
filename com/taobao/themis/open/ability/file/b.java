package com.taobao.themis.open.ability.file;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.r;
import com.taobao.themis.kernel.utils.s;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.bte;
import tb.dvq;
import tb.fxb;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.toh;
import tb.toj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J&\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ \u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010'\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002J\u001e\u0010(\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ(\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ&\u0010+\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ&\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fJ(\u0010-\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u00100\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ&\u00101\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ:\u00104\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/taobao/themis/open/ability/file/TMSFileAbility;", "", "()V", "DATA_TYPE_ARRAY_BUFFER", "", RPCDataItems.SWITCH_TAG_LOG, bte.TAG_ACCESS, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "path", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "canNotWrite", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "msg", "checkFolderSizeLimited", "", "context", "Landroid/content/Context;", com.alibaba.alibity.container.file.a.API_APPEND_FILE, "bizId", com.alibaba.alibity.container.file.a.API_COPY_FILE, "srcPath", "destPath", "digestError", "digestNonsupport", "directoryNotEmpty", "fileHasExits", "fileNotExist", "fileSizeExceedLimit", com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, "digestAlgorithm", "getFileList", "handleMegaFail", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "mkdir", "recursive", "nonsupportPath", "readDir", "readFile", "encoding", com.alibaba.alibity.container.file.a.API_RENAME, "rmdir", "saveFile", "tempFilePath", "filePath", "unlink", com.alibaba.alibity.container.file.a.API_UNZIP, "unZipFilePath", "targetPath", com.alibaba.alibity.container.file.a.API_WRITE_FILE, "append", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_TYPE_ARRAY_BUFFER = "ArrayBuffer";
    public static final b INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22642a;

        public a(BridgeCallback bridgeCallback) {
            this.f22642a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22642a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22642a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.file.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0956b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22643a;

        public C0956b(BridgeCallback bridgeCallback) {
            this.f22643a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22643a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22643a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22644a;

        public c(BridgeCallback bridgeCallback) {
            this.f22644a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22644a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22644a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            Object obj2 = map.get("size");
            Object obj3 = map.get(Constants.CodeCache.BANNER_DIGEST);
            BridgeCallback bridgeCallback = this.f22644a;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "success", (String) true);
            jSONObject2.put((JSONObject) "size", (String) obj2);
            jSONObject2.put((JSONObject) Constants.CodeCache.BANNER_DIGEST, (String) obj3);
            t tVar = t.INSTANCE;
            bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
            TMSLogger.b("TMSFileAbility", "getFileInfo success, size: " + obj2 + ", digest: " + obj3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22645a;
        public final /* synthetic */ com.taobao.themis.kernel.f b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ApPathType d;

        public d(BridgeCallback bridgeCallback, com.taobao.themis.kernel.f fVar, String str, ApPathType apPathType) {
            this.f22645a = bridgeCallback;
            this.b = fVar;
            this.c = str;
            this.d = apPathType;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22645a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22645a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            Object obj2 = map.get(dvq.FILES_DIR_NAME);
            if (!(obj2 instanceof ArrayList)) {
                obj2 = null;
            }
            ArrayList arrayList = (ArrayList) obj2;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    Map map2 = (Map) next;
                    Object obj3 = map2.get(UploadConstants.FILE_NAME);
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str = (String) obj3;
                    if (str != null) {
                        String b = toh.b(com.taobao.themis.kernel.utils.o.e(this.b), this.c + fxb.DIR + str, this.d);
                        if (b != null) {
                            Object obj4 = map2.get("createTime");
                            if (!(obj4 instanceof String)) {
                                obj4 = null;
                            }
                            String str2 = (String) obj4;
                            if (str2 != null) {
                                Object obj5 = map2.get("size");
                                if (!(obj5 instanceof String)) {
                                    obj5 = null;
                                }
                                String str3 = (String) obj5;
                                if (str3 != null) {
                                    arrayList2.add(ai.a(kotlin.j.a("apFilePath", b), kotlin.j.a("createTime", str2), kotlin.j.a("size", str3)));
                                }
                            }
                        }
                    }
                }
            }
            this.f22645a.sendBridgeResponse(BridgeResponse.newValue("fileList", arrayList2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22646a;

        public e(BridgeCallback bridgeCallback) {
            this.f22646a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22646a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22646a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22647a;

        public f(BridgeCallback bridgeCallback) {
            this.f22647a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22647a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22647a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            Object obj2 = map.get(dvq.FILES_DIR_NAME);
            if (!(obj2 instanceof ArrayList)) {
                obj2 = null;
            }
            ArrayList arrayList = (ArrayList) obj2;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    Object obj3 = ((Map) next).get(UploadConstants.FILE_NAME);
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str = (String) obj3;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
            this.f22647a.sendBridgeResponse(BridgeResponse.newValue(dvq.FILES_DIR_NAME, arrayList2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22648a;

        public g(BridgeCallback bridgeCallback) {
            this.f22648a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22648a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22648a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            Object obj2 = map.get("data");
            if (!(obj2 instanceof ByteBuffer)) {
                obj2 = null;
            }
            ByteBuffer byteBuffer = (ByteBuffer) obj2;
            if (byteBuffer == null) {
                this.f22648a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get byteBuffer data from mega");
                return;
            }
            BridgeCallback bridgeCallback = this.f22648a;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "success", (String) true);
            jSONObject2.put((JSONObject) "dataType", "ArrayBuffer");
            jSONObject2.put((JSONObject) "data", (String) byteBuffer.array());
            t tVar = t.INSTANCE;
            bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class h implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22649a;

        public h(BridgeCallback bridgeCallback) {
            this.f22649a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22649a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22649a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            Object obj2 = map.get("data");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            if (str == null) {
                this.f22649a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get data from mega");
                return;
            }
            BridgeCallback bridgeCallback = this.f22649a;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "success", (String) true);
            jSONObject2.put((JSONObject) "data", str);
            t tVar = t.INSTANCE;
            bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class i implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22650a;

        public i(BridgeCallback bridgeCallback) {
            this.f22650a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22650a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22650a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class j implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22651a;

        public j(BridgeCallback bridgeCallback) {
            this.f22651a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22651a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22651a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class k implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22652a;
        public final /* synthetic */ com.taobao.themis.kernel.f b;

        public k(BridgeCallback bridgeCallback, com.taobao.themis.kernel.f fVar) {
            this.f22652a = bridgeCallback;
            this.b = fVar;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (!data.d()) {
                b.a(b.INSTANCE, data, this.f22652a);
                return;
            }
            JSONObject a2 = data.a();
            Object obj = a2 != null ? a2.get("data") : null;
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map == null) {
                this.f22652a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "saveFile, can't get data from mega");
                return;
            }
            Object obj2 = map.get("savedFilePath");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                this.f22652a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "saveFile, can't get savedFilePath from mega");
                return;
            }
            String b = toh.b(com.taobao.themis.kernel.utils.o.e(this.b), str, ApPathType.AP_PATH_TYPE_USR);
            String str3 = b;
            if (str3 != null && str3.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                this.f22652a.sendBridgeResponse(BridgeResponse.newValue("apFilePath", b));
                return;
            }
            this.f22652a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.d("TMSFileAbility", "saveFile, can't get apPath");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class l implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22653a;

        public l(BridgeCallback bridgeCallback) {
            this.f22653a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                this.f22653a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, data, this.f22653a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "megaResult", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class m implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22654a;

        public m(BridgeCallback bridgeCallback) {
            this.f22654a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy megaResult, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, megaResult, new Boolean(z)});
                return;
            }
            q.b(megaResult, "megaResult");
            if (megaResult.d()) {
                this.f22654a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, megaResult, this.f22654a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "megaResult", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class n implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22655a;

        public n(BridgeCallback bridgeCallback) {
            this.f22655a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy megaResult, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, megaResult, new Boolean(z)});
                return;
            }
            q.b(megaResult, "megaResult");
            if (megaResult.d()) {
                this.f22655a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, megaResult, this.f22655a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "megaResult", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class o implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22656a;

        public o(BridgeCallback bridgeCallback) {
            this.f22656a = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy megaResult, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, megaResult, new Boolean(z)});
                return;
            }
            q.b(megaResult, "megaResult");
            if (megaResult.d()) {
                this.f22656a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                b.a(b.INSTANCE, megaResult, this.f22656a);
            }
        }
    }

    static {
        kge.a(-154997741);
        INSTANCE = new b();
    }

    private b() {
    }

    public static final /* synthetic */ void a(b bVar, qoy qoyVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccd3151", new Object[]{bVar, qoyVar, bridgeCallback});
        } else {
            bVar.a(qoyVar, bridgeCallback);
        }
    }

    public final void a(com.taobao.themis.kernel.f instance, String path, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbc1a5", new Object[]{this, instance, path, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            ApPathType a2 = toh.a(path, instance);
            if (a2 == ApPathType.AP_PATH_TYPE_PKG) {
                if (toj.a(path, instance)) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    return;
                }
                bridgeCallback.sendBridgeResponse(c("文件/目录不存在 " + path));
                TMSLogger.d("TMSFileAbility", "file/dir not found");
                return;
            }
            String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, a2);
            String str = a3;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.a(instance, a3, new a(bridgeCallback));
        }
    }

    public final void b(com.taobao.themis.kernel.f instance, String path, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c274efc4", new Object[]{this, instance, path, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "readDir, param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "readDir, param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "readDir, access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.b(instance, a2, new f(bridgeCallback));
        }
    }

    public final void a(com.taobao.themis.kernel.f instance, String path, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48580c9f", new Object[]{this, instance, path, new Boolean(z), bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            if (z2) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.a(instance, a2, Boolean.valueOf(z), new e(bridgeCallback));
        }
    }

    public final void b(com.taobao.themis.kernel.f instance, String path, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4a260", new Object[]{this, instance, path, new Boolean(z), bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            if (z2) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.b(instance, a2, Boolean.valueOf(z), new j(bridgeCallback));
        }
    }

    public final void c(com.taobao.themis.kernel.f instance, String path, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1e1de3", new Object[]{this, instance, path, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            ApPathType a2 = toh.a(path, instance);
            if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.d("TMSFileAbility", "param is invalid! path can't support");
            }
            String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, a2);
            String str = a3;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.b(instance, a3, new d(bridgeCallback, instance, a3, a2));
        }
    }

    public final void a(com.taobao.themis.kernel.f instance, String path, String encoding, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d701e5b", new Object[]{this, instance, path, encoding, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(encoding, "encoding");
        q.d(bridgeCallback, "bridgeCallback");
        if (encoding.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! encoding is empty!");
            return;
        }
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
            } else if (q.a((Object) encoding, (Object) "ArrayBuffer")) {
                com.taobao.themis.open.ability.file.a.INSTANCE.c(instance, a2, new g(bridgeCallback));
            } else {
                com.taobao.themis.open.ability.file.a.INSTANCE.a(instance, a2, encoding, new h(bridgeCallback));
            }
        }
    }

    public final void b(com.taobao.themis.kernel.f instance, String srcPath, String destPath, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960ba2ba", new Object[]{this, instance, srcPath, destPath, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(srcPath, "srcPath");
        q.d(destPath, "destPath");
        q.d(bridgeCallback, "bridgeCallback");
        if (!(srcPath.length() == 0)) {
            if (!(destPath.length() == 0)) {
                if (com.taobao.themis.utils.io.c.a(srcPath) || com.taobao.themis.utils.io.c.a(destPath)) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
                    return;
                }
                String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), srcPath, null, 4, null);
                String str = a2;
                if (str == null || str.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), destPath, null, 4, null);
                String str2 = a3;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                if (z) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                com.taobao.themis.open.ability.file.a.INSTANCE.b(instance, a2, a3, new C0956b(bridgeCallback));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
    }

    public final void c(com.taobao.themis.kernel.f instance, String unZipFilePath, String targetPath, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea72719", new Object[]{this, instance, unZipFilePath, targetPath, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(unZipFilePath, "unZipFilePath");
        q.d(targetPath, "targetPath");
        q.d(bridgeCallback, "bridgeCallback");
        if (!(unZipFilePath.length() == 0)) {
            if (!(targetPath.length() == 0)) {
                if (com.taobao.themis.utils.io.c.a(unZipFilePath) || com.taobao.themis.utils.io.c.a(targetPath)) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
                    return;
                }
                String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), unZipFilePath, null, 4, null);
                String str = a2;
                if (str == null || str.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), targetPath, null, 4, null);
                String str2 = a3;
                if (str2 == null || str2.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                String a4 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), s.PATH_PREFIX, null, 4, null);
                String str3 = a4;
                if (str3 != null && str3.length() != 0) {
                    z = false;
                }
                if (z) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.d("TMSFileAbility", "can't get usrRootDir");
                }
                com.taobao.themis.open.ability.file.a.INSTANCE.c(instance, a2, a3, a4, new m(bridgeCallback));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
    }

    public final void a(com.taobao.themis.kernel.f instance, String path, String data, String encoding, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b33d233", new Object[]{this, instance, path, data, encoding, new Boolean(z), bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(data, "data");
        q.d(encoding, "encoding");
        q.d(bridgeCallback, "bridgeCallback");
        if (encoding.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! encoding is empty!");
            return;
        }
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str == null || str.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            long length = data.length();
            if (z) {
                length += com.taobao.themis.utils.io.c.e(a2);
            }
            if (length > i.a.f22536a) {
                bridgeCallback.sendBridgeResponse(a(this, (String) null, 1, (Object) null));
                TMSLogger.d("TMSFileAbility", "file size too large!");
                return;
            }
            String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), s.PATH_PREFIX, null, 4, null);
            String str2 = a3;
            if (str2 == null || str2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.d("TMSFileAbility", "can't get usrRootDir");
            }
            if (com.taobao.themis.utils.io.c.e(a3) + length > i.a.b) {
                bridgeCallback.sendBridgeResponse(a(this, (String) null, 1, (Object) null));
                TMSLogger.d("TMSFileAbility", "file size too large!");
            } else if (z) {
                com.taobao.themis.open.ability.file.a.INSTANCE.b(instance, a2, data, encoding, new n(bridgeCallback));
            } else {
                com.taobao.themis.open.ability.file.a.INSTANCE.a(instance, a2, data, encoding, new o(bridgeCallback));
            }
        }
    }

    public final void d(com.taobao.themis.kernel.f instance, String tempFilePath, String filePath, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a742ab78", new Object[]{this, instance, tempFilePath, filePath, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(tempFilePath, "tempFilePath");
        q.d(filePath, "filePath");
        q.d(bridgeCallback, "bridgeCallback");
        if (!(tempFilePath.length() == 0)) {
            if (!(filePath.length() == 0)) {
                if (com.taobao.themis.utils.io.c.a(tempFilePath) || com.taobao.themis.utils.io.c.a(filePath)) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
                    return;
                }
                String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), tempFilePath, null, 4, null);
                String str = a2;
                if (str == null || str.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                if (toh.a(filePath, instance) != ApPathType.AP_PATH_TYPE_USR) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "only usr path is allowed to save");
                }
                String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), filePath, null, 4, null);
                String str2 = a3;
                if (str2 == null || str2.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                String e2 = com.taobao.themis.kernel.utils.o.e(instance);
                String str3 = e2;
                if (str3 != null && str3.length() != 0) {
                    z = false;
                }
                if (z) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "saveFile, access failed! bizId is null or empty");
                    return;
                }
                Activity o2 = instance.o();
                q.b(o2, "instance.activity");
                if (a(o2, a2, e2)) {
                    bridgeCallback.sendBridgeResponse(h("文件存储大小限制为 10M"));
                    TMSLogger.d("TMSFileAbility", "file size limited!");
                    return;
                }
                com.taobao.themis.open.ability.file.a.INSTANCE.d(instance, a2, a3, new k(bridgeCallback, instance));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
    }

    public final void d(com.taobao.themis.kernel.f instance, String path, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c74c02", new Object[]{this, instance, path, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.d(instance, a2, new l(bridgeCallback));
        }
    }

    public final void e(com.taobao.themis.kernel.f instance, String path, String digestAlgorithm, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afde2fd7", new Object[]{this, instance, path, digestAlgorithm, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(path, "path");
        q.d(digestAlgorithm, "digestAlgorithm");
        q.d(bridgeCallback, "bridgeCallback");
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
        } else if (com.taobao.themis.utils.io.c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), path, null, 4, null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            com.taobao.themis.open.ability.file.a.INSTANCE.c(instance, a2, digestAlgorithm, new c(bridgeCallback));
        }
    }

    public final void f(com.taobao.themis.kernel.f instance, String srcPath, String destPath, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b879b436", new Object[]{this, instance, srcPath, destPath, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(srcPath, "srcPath");
        q.d(destPath, "destPath");
        q.d(bridgeCallback, "bridgeCallback");
        if (!(srcPath.length() == 0)) {
            if (!(destPath.length() == 0)) {
                if (com.taobao.themis.utils.io.c.a(srcPath) || com.taobao.themis.utils.io.c.a(destPath)) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    TMSLogger.d("TMSFileAbility", "param is invalid! path contains relative parent!");
                    return;
                }
                String a2 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), srcPath, null, 4, null);
                String str = a2;
                if (str == null || str.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                String a3 = toh.a(com.taobao.themis.kernel.utils.o.e(instance), destPath, null, 4, null);
                String str2 = a3;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                if (z) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                com.taobao.themis.open.ability.file.a.INSTANCE.d(instance, a2, a3, new i(bridgeCallback));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("TMSFileAbility", "param is invalid! path is empty!");
    }

    private final boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String a2 = r.Companion.a(str2, context).a();
        String str3 = a2;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        long b = com.taobao.themis.utils.io.a.b(new File(a2));
        long length = new File(str).length();
        TMSLogger.b("TMSFileAbility", "checkFolderSizeLimited appendSize=" + length + ",folderSize=" + b);
        if (b + length <= i.a.f22536a) {
            return false;
        }
        TMSLogger.d("TMSFileAbility", "checkFolderSizeLimited file exceed limited size");
        return true;
    }

    private final void a(qoy qoyVar, BridgeCallback bridgeCallback) {
        BridgeResponse.Error a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146f78bf", new Object[]{this, qoyVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a3 = qoyVar.a();
            JSONObject jSONObject = a3 != null ? a3.getJSONObject("errorMessage") : null;
            if (jSONObject == null) {
                TMSLogger.d("TMSFileAbility", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("code");
            String string = jSONObject.getString("msg");
            if (string == null) {
                string = "";
            }
            if (intValue == 1016) {
                a2 = a(string);
            } else if (intValue == 1017) {
                a2 = b(string);
            } else {
                switch (intValue) {
                    case 1021:
                        a2 = c(string);
                        break;
                    case 1022:
                        a2 = c(string);
                        break;
                    case 1023:
                        a2 = d(string);
                        break;
                    case 1024:
                        a2 = d(string);
                        break;
                    case 1025:
                        a2 = e(string);
                        break;
                    case 1026:
                        a2 = g(string);
                        break;
                    case 1027:
                        a2 = f(string);
                        break;
                    case 1028:
                        a2 = f(string);
                        break;
                    case 1029:
                        a2 = f(string);
                        break;
                    case 1030:
                        a2 = h(string);
                        break;
                    default:
                        a2 = BridgeResponse.newError(3, string);
                        break;
                }
            }
            bridgeCallback.sendBridgeResponse(a2);
            TMSLogger.d("TMSFileAbility", "mega fail! code:" + intValue + " msg:" + string);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.b("TMSFileAbility", th.getMessage(), th);
        }
    }

    private final BridgeResponse a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("764b35e2", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(16, str);
        q.b(newError, "BridgeResponse.newError(16, msg)");
        return newError;
    }

    private final BridgeResponse b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("2e37a363", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(17, str);
        q.b(newError, "BridgeResponse.newError(17, msg)");
        return newError;
    }

    private final BridgeResponse c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("e62410e4", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10022, str);
        q.b(newError, "BridgeResponse.newError(10022, msg)");
        return newError;
    }

    private final BridgeResponse d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("9e107e65", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(WXExceptionConfig.EXCEPTION_SO_LOAD_FAIL, str);
        q.b(newError, "BridgeResponse.newError(10024, msg)");
        return newError;
    }

    private final BridgeResponse e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("55fcebe6", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR, str);
        q.b(newError, "BridgeResponse.newError(10025, msg)");
        return newError;
    }

    private final BridgeResponse f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("de95967", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(WXExceptionConfig.EXCEPTION_JS_ENGINE_ERROR, str);
        q.b(newError, "BridgeResponse.newError(10026, msg)");
        return newError;
    }

    private final BridgeResponse g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("c5d5c6e8", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(WXExceptionConfig.EXCEPTION_MTOP_ERROR, str);
        q.b(newError, "BridgeResponse.newError(10027, msg)");
        return newError;
    }

    public static /* synthetic */ BridgeResponse a(b bVar, String str, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("2a5d8af", new Object[]{bVar, str, new Integer(i2), obj});
        }
        if ((i2 & 1) != 0) {
            str = "单个文件大小超限";
        }
        return bVar.h(str);
    }

    private final BridgeResponse h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("7dc23469", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(i.a.c, str);
        q.b(newError, "BridgeResponse.newError(…_FILE_EXCEEDS_LIMIT, msg)");
        return newError;
    }
}
