package com.alibaba.alibity.container.file;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.ability.impl.file.d;
import com.alibaba.ability.impl.file.f;
import com.alibaba.ability.impl.file.g;
import com.alibaba.ability.impl.file.h;
import com.alibaba.ability.impl.file.k;
import com.alibaba.ability.impl.file.n;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.vessel.utils.c;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.aln;
import tb.als;
import tb.bte;
import tb.dvq;
import tb.fxb;
import tb.ogw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J2\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\u0002`\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J<\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\u0002`\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0002J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u0002J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0002J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J$\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002J6\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0010H\u0002¨\u00062"}, d2 = {"Lcom/alibaba/alibity/container/file/FileAbility;", "Lcom/alibaba/ability/IAbility;", "()V", bte.TAG_ACCESS, "Lcom/alibaba/ability/result/ExecuteResult;", "path", "", "apiDispatch", "apiName", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "checkEncoding", "", "encoding", "convertEncoding", a.API_COPY_FILE, "srcPath", "destPath", e.RECORD_EXECUTE, "api", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", a.API_GET_FILE_INFO, "filePath", "digestAlgorithm", "mkdir", "dirPath", "recursive", a.API_READ_AS_ARRAY_BUFFER, a.API_READ_AS_STRING, "readDir", a.API_RENAME, "oldPath", "newPath", "rmdir", "unlink", a.API_UNZIP, "unzipFilePath", "targetPath", "limitRootDicPath", a.API_WRITE_FILE, "dataStr", "dataByteBuffer", "Ljava/nio/ByteBuffer;", "append", "Companion", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_APPEND_FILE = "appendFile";
    public static final String API_COPY_FILE = "copyFile";
    public static final String API_EXISTS = "exists";
    public static final String API_GET_DIR_INFO = "getDirInfo";
    public static final String API_GET_FILE_INFO = "getFileInfo";
    public static final String API_MAKE_DIR = "makeDir";
    public static final String API_READ_AS_ARRAY_BUFFER = "readAsBuffer";
    public static final String API_READ_AS_STRING = "readAsString";
    public static final String API_REMOVE_DIR = "removeDir";
    public static final String API_REMOVE_FILE = "removeFile";
    public static final String API_RENAME = "rename";
    public static final String API_UNZIP = "unzip";
    public static final String API_WRITE_FILE = "writeFile";
    public static final C0061a Companion = new C0061a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/alibaba/alibity/container/file/FileAbility$Companion;", "", "()V", "API_APPEND_FILE", "", "API_COPY_FILE", "API_EXISTS", "API_GET_DIR_INFO", "API_GET_FILE_INFO", "API_MAKE_DIR", "API_READ_AS_ARRAY_BUFFER", "API_READ_AS_STRING", "API_REMOVE_DIR", "API_REMOVE_FILE", "API_RENAME", "API_UNZIP", "API_WRITE_FILE", "FILE_ENCODING_ARRAY_BUFFER", "FILE_ENCODING_BASE64", "FILE_ENCODING_BINARY", "FILE_ENCODING_DIRECT_ARRAY_BUFFER", "FILE_ENCODING_HEX", "MAX_DIR_SIZE", "", "MAX_FILE_SIZE", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.alibaba.alibity.container.file.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0061a {
        private C0061a() {
        }

        public /* synthetic */ C0061a(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ als c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ aln e;

        public b(String str, als alsVar, Map map, aln alnVar) {
            this.b = str;
            this.c = alsVar;
            this.d = map;
            this.e = alnVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Log.e("FileAbility", "execute api: " + this.b);
            ExecuteResult a2 = a.a(a.this, this.b, this.c, this.d);
            if (a2 instanceof FinishResult) {
                this.e.a((FinishResult) a2);
            } else if (a2 instanceof ErrorResult) {
                this.e.a((ErrorResult) a2);
            } else if (a2 instanceof ExecutingResult) {
                this.e.a((ExecutingResult) a2);
            } else {
                this.e.a(new ErrorResult("500", "内部未知错误", (Map) null, 4, (o) null));
            }
        }
    }

    public static final /* synthetic */ ExecuteResult a(a aVar, String str, als alsVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("d81c4c41", new Object[]{aVar, str, alsVar, map}) : aVar.a(str, alsVar, map);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        com.alibaba.ability.e.c((Runnable) new b(api, context, params, callback));
        return null;
    }

    private final ExecuteResult a(String str, als alsVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("613bd514", new Object[]{this, str, alsVar, map});
        }
        String str2 = "ArrayBuffer";
        switch (str.hashCode()) {
            case -2139808842:
                if (str.equals(API_APPEND_FILE)) {
                    Object obj = map.get("path");
                    boolean z = obj instanceof String;
                    Object obj2 = obj;
                    if (!z) {
                        obj2 = null;
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    Object obj3 = map.get("encoding");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str4 = (String) obj3;
                    String str5 = str4 == null ? "utf8" : str4;
                    if (q.a((Object) str5, (Object) "DirectArrayBuffer") || q.a((Object) str5, (Object) str2)) {
                        Object obj4 = map.get("data");
                        boolean z2 = obj4 instanceof ByteBuffer;
                        Object obj5 = obj4;
                        if (!z2) {
                            obj5 = null;
                        }
                        ByteBuffer byteBuffer = (ByteBuffer) obj5;
                        if (byteBuffer == null) {
                            return com.alibaba.ability.result.a$a.Companion.b(c.LOAD_DATA_NULL);
                        }
                        return a(str3, null, byteBuffer, str5, true);
                    }
                    Object obj6 = map.get("data");
                    boolean z3 = obj6 instanceof String;
                    Object obj7 = obj6;
                    if (!z3) {
                        obj7 = null;
                    }
                    String str6 = (String) obj7;
                    if (str6 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b(c.LOAD_DATA_NULL);
                    }
                    return a(str3, str6, null, str5, true);
                }
                break;
            case -1588426075:
                if (str.equals(API_GET_DIR_INFO)) {
                    Object obj8 = map.get("path");
                    if (!(obj8 instanceof String)) {
                        obj8 = null;
                    }
                    String str7 = (String) obj8;
                    if (str7 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("dirPath is null");
                    }
                    return b(str7);
                }
                break;
            case -1406748165:
                if (str.equals(API_WRITE_FILE)) {
                    Object obj9 = map.get("path");
                    boolean z4 = obj9 instanceof String;
                    Object obj10 = obj9;
                    if (!z4) {
                        obj10 = null;
                    }
                    String str8 = (String) obj10;
                    if (str8 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    Object obj11 = map.get("encoding");
                    if (!(obj11 instanceof String)) {
                        obj11 = null;
                    }
                    String str9 = (String) obj11;
                    String str10 = str9 == null ? "utf8" : str9;
                    if (q.a((Object) alsVar.f().e(), (Object) TMSCalendarBridge.namespace) && (q.a((Object) str10, (Object) "DirectArrayBuffer") || q.a((Object) str10, (Object) str2))) {
                        Object obj12 = map.get("data");
                        boolean z5 = obj12 instanceof ByteBuffer;
                        Object obj13 = obj12;
                        if (!z5) {
                            obj13 = null;
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) obj13;
                        if (byteBuffer2 == null) {
                            return com.alibaba.ability.result.a$a.Companion.b(c.LOAD_DATA_NULL);
                        }
                        return a(str8, null, byteBuffer2, str10, false);
                    }
                    Object obj14 = map.get("data");
                    boolean z6 = obj14 instanceof String;
                    Object obj15 = obj14;
                    if (!z6) {
                        obj15 = null;
                    }
                    String str11 = (String) obj15;
                    if (str11 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b(c.LOAD_DATA_NULL);
                    }
                    return a(str8, str11, null, str10, false);
                }
                break;
            case -1289358244:
                if (str.equals(API_EXISTS)) {
                    Object obj16 = map.get("path");
                    if (!(obj16 instanceof String)) {
                        obj16 = null;
                    }
                    String str12 = (String) obj16;
                    if (str12 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("path is null");
                    }
                    return a(str12);
                }
                break;
            case -934594754:
                if (str.equals(API_RENAME)) {
                    Object obj17 = map.get("src");
                    if (!(obj17 instanceof String)) {
                        obj17 = null;
                    }
                    String str13 = (String) obj17;
                    if (str13 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("oldPath is null");
                    }
                    Object obj18 = map.get("dest");
                    if (!(obj18 instanceof String)) {
                        obj18 = null;
                    }
                    String str14 = (String) obj18;
                    if (str14 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("newPath is null");
                    }
                    return e(str13, str14);
                }
                break;
            case -506374511:
                if (str.equals(API_COPY_FILE)) {
                    Object obj19 = map.get("src");
                    if (!(obj19 instanceof String)) {
                        obj19 = null;
                    }
                    String str15 = (String) obj19;
                    if (str15 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("srcPath is null");
                    }
                    Object obj20 = map.get("dest");
                    if (!(obj20 instanceof String)) {
                        obj20 = null;
                    }
                    String str16 = (String) obj20;
                    if (str16 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("destPath is null");
                    }
                    return c(str15, str16);
                }
                break;
            case 111449576:
                if (str.equals(API_UNZIP)) {
                    Object obj21 = map.get("src");
                    if (!(obj21 instanceof String)) {
                        obj21 = null;
                    }
                    String str17 = (String) obj21;
                    if (str17 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("zipFilePath is null");
                    }
                    Object obj22 = map.get("dest");
                    if (!(obj22 instanceof String)) {
                        obj22 = null;
                    }
                    String str18 = (String) obj22;
                    if (str18 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("newPath is null");
                    }
                    Object obj23 = map.get("limitRootDicPath");
                    if (!(obj23 instanceof String)) {
                        obj23 = null;
                    }
                    return a(str17, str18, (String) obj23);
                }
                break;
            case 832575423:
                if (str.equals(API_MAKE_DIR)) {
                    Object obj24 = map.get("path");
                    if (!(obj24 instanceof String)) {
                        obj24 = null;
                    }
                    String str19 = (String) obj24;
                    if (str19 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("dirPath is null");
                    }
                    Object obj25 = map.get("recursive");
                    if (!(obj25 instanceof Boolean)) {
                        obj25 = null;
                    }
                    Boolean bool = (Boolean) obj25;
                    return a(str19, bool != null ? bool.booleanValue() : false);
                }
                break;
            case 1086252744:
                if (str.equals(API_READ_AS_ARRAY_BUFFER)) {
                    Object obj26 = map.get("path");
                    if (!(obj26 instanceof String)) {
                        obj26 = null;
                    }
                    String str20 = (String) obj26;
                    if (str20 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    if (q.a((Object) alsVar.f().e(), (Object) TMSCalendarBridge.namespace)) {
                        Object obj27 = map.get("encoding");
                        if (!(obj27 instanceof String)) {
                            obj27 = null;
                        }
                        String str21 = (String) obj27;
                        if (str21 != null) {
                            str2 = str21;
                        }
                    }
                    return b(str20, str2);
                }
                break;
            case 1098154016:
                if (str.equals(API_REMOVE_FILE)) {
                    Object obj28 = map.get("path");
                    if (!(obj28 instanceof String)) {
                        obj28 = null;
                    }
                    String str22 = (String) obj28;
                    if (str22 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    return e(str22);
                }
                break;
            case 1282348393:
                if (str.equals(API_REMOVE_DIR)) {
                    Object obj29 = map.get("path");
                    if (!(obj29 instanceof String)) {
                        obj29 = null;
                    }
                    String str23 = (String) obj29;
                    if (str23 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("dirPath is null");
                    }
                    Object obj30 = map.get("recursive");
                    if (!(obj30 instanceof Boolean)) {
                        obj30 = null;
                    }
                    Boolean bool2 = (Boolean) obj30;
                    return b(str23, bool2 != null ? bool2.booleanValue() : false);
                }
                break;
            case 1342041536:
                if (str.equals(API_GET_FILE_INFO)) {
                    Object obj31 = map.get("path");
                    if (!(obj31 instanceof String)) {
                        obj31 = null;
                    }
                    String str24 = (String) obj31;
                    if (str24 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    Object obj32 = map.get("digestAlgorithm");
                    if (!(obj32 instanceof String)) {
                        obj32 = null;
                    }
                    String str25 = (String) obj32;
                    if (str25 == null) {
                        str25 = "md5";
                    }
                    return d(str24, str25);
                }
                break;
            case 1572385433:
                if (str.equals(API_READ_AS_STRING)) {
                    Object obj33 = map.get("path");
                    if (!(obj33 instanceof String)) {
                        obj33 = null;
                    }
                    String str26 = (String) obj33;
                    if (str26 == null) {
                        return com.alibaba.ability.result.a$a.Companion.b("filePath is null");
                    }
                    Object obj34 = map.get("encoding");
                    if (!(obj34 instanceof String)) {
                        obj34 = null;
                    }
                    String str27 = (String) obj34;
                    if (str27 == null) {
                        str27 = ogw.BIN_TAG;
                    }
                    return a(str26, str27);
                }
                break;
        }
        return com.alibaba.ability.result.a$a.Companion.a("未找到对应的文件API");
    }

    private final ExecuteResult a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a25bd70d", new Object[]{this, str});
        }
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        if (f.INSTANCE.b(str)) {
            return new FinishResult(null, "success", 1, null);
        }
        return com.alibaba.alibity.container.file.b.d(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
    }

    private final ExecuteResult b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("20bcdaec", new Object[]{this, str});
        }
        if (str.length() == 0) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return com.alibaba.alibity.container.file.b.d(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!file.isDirectory()) {
            return com.alibaba.alibity.container.file.b.j(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return com.alibaba.alibity.container.file.b.e(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                q.b(file2, "file");
                arrayList.add(ai.a(j.a("size", String.valueOf(d.b(file2))), j.a(UploadConstants.FILE_NAME, file2.getName()), j.a("createTime", String.valueOf(d.c(file2)))));
            }
        }
        return new FinishResult(ai.a(j.a(dvq.FILES_DIR_NAME, arrayList), j.a("type", "details")), "success");
    }

    private final ExecuteResult a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("fc46bc5d", new Object[]{this, str, new Boolean(z)});
        }
        if (str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        File file = new File(str);
        if (file.exists()) {
            return com.alibaba.alibity.container.file.b.g(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (z) {
            if (file.mkdirs()) {
                return new FinishResult(null, "success", 1, null);
            }
            return new ErrorResult(String.valueOf(499), "未知错误，文件夹创建失败", (Map) null, 4, (o) null);
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return com.alibaba.alibity.container.file.b.c(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        File parentFile2 = file.getParentFile();
        if (parentFile2 == null || !parentFile2.canWrite()) {
            return com.alibaba.alibity.container.file.b.f(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (file.mkdir()) {
            return new FinishResult(null, "success", 1, null);
        }
        return new ErrorResult(String.valueOf(499), "未知错误，文件夹创建失败", (Map) null, 4, (o) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if ((r8.length == 0) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.ability.result.ExecuteResult b(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.alibity.container.file.a.b(java.lang.String, boolean):com.alibaba.ability.result.ExecuteResult");
    }

    private final ExecuteResult a(String str, String str2) {
        FileInputStream fileInputStream;
        FinishResult finishResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("49a91103", new Object[]{this, str, str2});
        }
        if (str.length() == 0) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return com.alibaba.alibity.container.file.b.d(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return com.alibaba.alibity.container.file.b.i(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return com.alibaba.alibity.container.file.b.e(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!d(str2)) {
            return com.alibaba.ability.result.a$a.Companion.b("encoding is invalid");
        }
        FileInputStream fileInputStream2 = null;
        k.INSTANCE.a(str);
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1396204209) {
                        if (str2.equals("base64")) {
                            byte[] a2 = h.INSTANCE.a((InputStream) fileInputStream);
                            if (a2 == null) {
                                ErrorResult errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                                k.INSTANCE.c(str);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                return errorResult;
                            }
                            q.b(a2, "IOUtils.INSTANCE.inputTo…Z_EXP.toString(), \"未知错误\")");
                            String encodeToString = Base64.encodeToString(a2, 2);
                            if (encodeToString == null) {
                                ErrorResult errorResult2 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                                k.INSTANCE.c(str);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                return errorResult2;
                            }
                            finishResult = new FinishResult(ai.a(j.a("data", encodeToString), j.a("dataType", com.taobao.android.weex_framework.util.a.ATOM_String)), null, 2, null);
                            k.INSTANCE.c(str);
                            h.INSTANCE.a((Closeable) fileInputStream);
                            return finishResult;
                        }
                        FinishResult finishResult2 = new FinishResult(ai.a(j.a("data", new String(h.INSTANCE.a((InputStream) fileInputStream), c(str2))), j.a("dataType", com.taobao.android.weex_framework.util.a.ATOM_String)), null, 2, null);
                        k.INSTANCE.c(str);
                        h.INSTANCE.a((Closeable) fileInputStream);
                        return finishResult2;
                    }
                    if (hashCode != -1388966911) {
                        if (hashCode == 103195 && str2.equals("hex")) {
                            byte[] a3 = h.INSTANCE.a((InputStream) fileInputStream);
                            if (a3 == null) {
                                ErrorResult errorResult3 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                                k.INSTANCE.c(str);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                return errorResult3;
                            }
                            q.b(a3, "IOUtils.INSTANCE.inputTo…Z_EXP.toString(), \"未知错误\")");
                            String a4 = g.INSTANCE.a(a3);
                            q.b(a4, "HexUtils.INSTANCE.byteArrayToHex(binaryData)");
                            finishResult = new FinishResult(ai.a(j.a("data", a4), j.a("dataType", com.taobao.android.weex_framework.util.a.ATOM_String)), null, 2, null);
                            k.INSTANCE.c(str);
                            h.INSTANCE.a((Closeable) fileInputStream);
                            return finishResult;
                        }
                    } else if (str2.equals(ogw.BIN_TAG)) {
                        byte[] a5 = h.INSTANCE.a((InputStream) fileInputStream);
                        if (a5 == null) {
                            ErrorResult errorResult4 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                            k.INSTANCE.c(str);
                            h.INSTANCE.a((Closeable) fileInputStream);
                            return errorResult4;
                        }
                        q.b(a5, "IOUtils.INSTANCE.inputTo…Z_EXP.toString(), \"未知错误\")");
                        FinishResult finishResult3 = new FinishResult(ai.a(j.a("data", new String(a5, kotlin.text.d.UTF_8)), j.a("dataType", com.taobao.android.weex_framework.util.a.ATOM_String)), null, 2, null);
                        k.INSTANCE.c(str);
                        h.INSTANCE.a((Closeable) fileInputStream);
                        return finishResult3;
                    }
                    FinishResult finishResult22 = new FinishResult(ai.a(j.a("data", new String(h.INSTANCE.a((InputStream) fileInputStream), c(str2))), j.a("dataType", com.taobao.android.weex_framework.util.a.ATOM_String)), null, 2, null);
                    k.INSTANCE.c(str);
                    h.INSTANCE.a((Closeable) fileInputStream);
                    return finishResult22;
                } catch (Exception e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    e.printStackTrace();
                    k.INSTANCE.c(str);
                    h.INSTANCE.a((Closeable) fileInputStream2);
                    return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                } catch (Throwable th) {
                    th = th;
                    k.INSTANCE.c(str);
                    h.INSTANCE.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.alibaba.ability.result.ErrorResult] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.android.alibaba.ip.runtime.IpChange] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.alibaba.ability.impl.file.f] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.alibaba.ability.impl.file.k] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final ExecuteResult b(String str, String str2) {
        FileInputStream fileInputStream;
        ?? r1 = str;
        ?? r2 = $ipChange;
        if (r2 instanceof IpChange) {
            return (ExecuteResult) r2.ipc$dispatch("785a7b22", new Object[]{this, r1, str2});
        }
        if (((CharSequence) r1).length() == 0) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(r1)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        File file = new File((String) r1);
        if (!file.exists()) {
            return com.alibaba.alibity.container.file.b.d(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return com.alibaba.alibity.container.file.b.i(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return com.alibaba.alibity.container.file.b.e(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if ((!q.a((Object) str2, (Object) "ArrayBuffer")) && (!q.a((Object) str2, (Object) "DirectArrayBuffer"))) {
            return com.alibaba.ability.result.a$a.Companion.b(null);
        }
        FileInputStream fileInputStream2 = null;
        k.INSTANCE.a(r1);
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    int hashCode = str2.hashCode();
                    ?? r8 = 1022819376;
                    if (hashCode != 1022819376) {
                        r8 = 1906553817;
                        r8 = 1906553817;
                        if (hashCode == 1906553817 && str2.equals("ArrayBuffer")) {
                            byte[] a2 = h.INSTANCE.a((InputStream) fileInputStream);
                            if (a2 == null) {
                                ErrorResult errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                                k.INSTANCE.c(r1);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                return errorResult;
                            }
                            q.b(a2, "IOUtils.INSTANCE.inputTo…Z_EXP.toString(), \"未知错误\")");
                            FinishResult finishResult = new FinishResult(ai.a(j.a("data", ByteBuffer.wrap(a2)), j.a("dataType", "ByteBuffer")), null, 2, null);
                            k.INSTANCE.c(r1);
                            h.INSTANCE.a((Closeable) fileInputStream);
                            return finishResult;
                        }
                    } else if (str2.equals("DirectArrayBuffer")) {
                        FileChannel channel = fileInputStream.getChannel();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) channel.size());
                        channel.read(allocateDirect);
                        FinishResult finishResult2 = new FinishResult(ai.a(j.a("data", allocateDirect), j.a("dataType", "ByteBuffer")), null, 2, null);
                        k.INSTANCE.c(r1);
                        h.INSTANCE.a((Closeable) fileInputStream);
                        return finishResult2;
                    }
                    k.INSTANCE.c(r1);
                    h.INSTANCE.a((Closeable) fileInputStream);
                    fileInputStream2 = r8;
                } catch (Exception e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    e.printStackTrace();
                    k.INSTANCE.c(r1);
                    FileInputStream fileInputStream3 = fileInputStream2;
                    h.INSTANCE.a((Closeable) fileInputStream3);
                    fileInputStream2 = fileInputStream3;
                    r1 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
                    return (ExecuteResult) r1;
                } catch (Throwable th) {
                    th = th;
                    k.INSTANCE.c(r1);
                    h.INSTANCE.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            r1 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
            return (ExecuteResult) r1;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    private final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        String str2 = str;
        return TextUtils.isEmpty(str2) ? str : (TextUtils.equals(str2, "ucs2") || TextUtils.equals(str2, "ucs-2") || TextUtils.equals(str2, "utf16le") || TextUtils.equals(str2, "utf-16le")) ? "UTF-16LE" : str;
    }

    private final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return p.c("ascii", "base64", ogw.BIN_TAG, "hex", "ucs2", "ucs-2", "utf16le", "utf-16le", "utf-8", "utf8", "latin1", "ArrayBuffer", "DirectArrayBuffer").contains(str);
        }
        return false;
    }

    private final ExecuteResult c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a70be541", new Object[]{this, str, str2});
        }
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (f.INSTANCE.a(str) || f.INSTANCE.a(str2)) {
                    return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
                }
                File file = new File(str);
                if (!file.exists()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.d("指定的 srcPath 文件不存在");
                }
                if (file.isDirectory()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.i("指定的 srcPath 是一个已经存在的目录");
                }
                if (!file.canRead()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.e("指定的 srcPath 路径没有读权限");
                }
                File file2 = new File(str2);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        file2 = new File(str2 + "/" + file.getName());
                    } else if (!file2.canWrite()) {
                        return com.alibaba.alibity.container.file.b.INSTANCE.f("指定的 destPath 路径没有写权限");
                    }
                } else {
                    File parentFile = file2.getParentFile();
                    if (parentFile == null || !parentFile.canWrite()) {
                        return com.alibaba.alibity.container.file.b.INSTANCE.f("指定的 destPath 路径没有写权限");
                    }
                }
                FileInputStream fileInputStream = null;
                FileOutputStream fileOutputStream = null;
                k.INSTANCE.a(str);
                k.INSTANCE.b(str2);
                byte[] a2 = h.INSTANCE.a(2048);
                q.b(a2, "IOUtils.INSTANCE.getBuf(IOUtils.IO_BUFFER_SIZE)");
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            while (true) {
                                try {
                                    int read = fileInputStream2.read(a2);
                                    if (read > 0) {
                                        fileOutputStream2.write(a2, 0, read);
                                    } else {
                                        FinishResult finishResult = new FinishResult(null, "success", 1, null);
                                        k.INSTANCE.c(str);
                                        k.INSTANCE.c(str);
                                        h.INSTANCE.a(a2);
                                        h.INSTANCE.a((Closeable) fileInputStream2);
                                        h.INSTANCE.a(fileOutputStream2);
                                        return finishResult;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream = fileInputStream2;
                                    ErrorResult errorResult = new ErrorResult(String.valueOf(499), "未知错误: " + e.getMessage(), (Map) null, 4, (o) null);
                                    k.INSTANCE.c(str);
                                    k.INSTANCE.c(str);
                                    h.INSTANCE.a(a2);
                                    h.INSTANCE.a((Closeable) fileInputStream);
                                    h.INSTANCE.a(fileOutputStream);
                                    return errorResult;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream = fileInputStream2;
                                    k.INSTANCE.c(str);
                                    k.INSTANCE.c(str);
                                    h.INSTANCE.a(a2);
                                    h.INSTANCE.a((Closeable) fileInputStream);
                                    h.INSTANCE.a(fileOutputStream);
                                    throw th;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }
        return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:53:0x00e3, B:57:0x00ef, B:60:0x00f9, B:63:0x0101, B:66:0x010a, B:68:0x0112, B:69:0x0119, B:72:0x0123, B:74:0x0127, B:75:0x012f, B:76:0x0134, B:77:0x0135, B:79:0x013d, B:80:0x0142, B:82:0x014c, B:84:0x0153, B:85:0x015b, B:86:0x0160), top: B:133:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.ability.result.ExecuteResult a(java.lang.String r20, java.lang.String r21, java.nio.ByteBuffer r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.alibity.container.file.a.a(java.lang.String, java.lang.String, java.nio.ByteBuffer, java.lang.String, boolean):com.alibaba.ability.result.ExecuteResult");
    }

    private final ExecuteResult e(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("9bdfe689", new Object[]{this, str});
        }
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return com.alibaba.alibity.container.file.b.d(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return com.alibaba.alibity.container.file.b.i(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (!file.canWrite()) {
            return com.alibaba.alibity.container.file.b.f(com.alibaba.alibity.container.file.b.INSTANCE, null, 1, null);
        }
        if (d.a(file)) {
            return new FinishResult(null, "success", 1, null);
        }
        return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.ability.result.ExecuteResult d(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.alibity.container.file.a.d(java.lang.String, java.lang.String):com.alibaba.ability.result.ExecuteResult");
    }

    private final ExecuteResult e(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("46eb97f", new Object[]{this, str, str2});
        }
        if (str.length() == 0) {
            return com.alibaba.ability.result.a$a.Companion.b("oldPath is empty");
        }
        if (f.INSTANCE.a(str)) {
            return com.alibaba.ability.result.a$a.Companion.b("oldPath contains relative parent path");
        }
        if (str2.length() == 0) {
            z = true;
        }
        if (z) {
            return com.alibaba.ability.result.a$a.Companion.b("newPath is empty");
        }
        if (f.INSTANCE.a(str2)) {
            return com.alibaba.ability.result.a$a.Companion.b("newPath contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return com.alibaba.alibity.container.file.b.INSTANCE.d("指定的 oldPath 文件不存在");
        }
        if (!file.canWrite()) {
            return com.alibaba.alibity.container.file.b.INSTANCE.e("指定的 oldPath 路径没有写权限");
        }
        File file2 = new File(str2);
        if (file2.exists() && file2.isFile()) {
            return com.alibaba.alibity.container.file.b.INSTANCE.g("指定路径已存在文件");
        }
        File file3 = new File(f.INSTANCE.a(str2, str));
        File parentFile = file3.getParentFile();
        if (parentFile == null || !parentFile.canWrite()) {
            return com.alibaba.alibity.container.file.b.INSTANCE.f("指定的 destPath 路径没有写权限");
        }
        if (file.renameTo(file3)) {
            return new FinishResult(ai.a(j.a("savedFilePath", file3.getAbsolutePath())), null, 2, null);
        }
        return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (o) null);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.zip.ZipInputStream, T] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.zip.ZipInputStream, T] */
    private final ExecuteResult a(String str, String str2, String str3) {
        Object m2371constructorimpl;
        Throwable m2374exceptionOrNullimpl;
        String str4;
        FileOutputStream fileOutputStream;
        n a2;
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("2933f979", new Object[]{this, str, str2, str3});
        }
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (f.INSTANCE.a(str) || f.INSTANCE.a(str2)) {
                    return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
                }
                File file = new File(str);
                if (!file.exists()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.d("源文件不存在 " + str);
                } else if (file.isDirectory()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.i("源文件不存在是一个目录 " + str);
                } else if (!file.canRead()) {
                    return com.alibaba.alibity.container.file.b.INSTANCE.e("源文件没有读权限 " + str);
                } else {
                    File file2 = new File(str2);
                    File parentFile = file2.getParentFile();
                    if (parentFile == null || !parentFile.exists()) {
                        return com.alibaba.alibity.container.file.b.INSTANCE.d("目标文件路径的上层目录不存在 " + str2);
                    }
                    if (file2.exists()) {
                        if (!file2.canWrite()) {
                            return com.alibaba.alibity.container.file.b.INSTANCE.f("指定目标文件路径没有写权限 " + str2);
                        }
                    } else {
                        File parentFile2 = file2.getParentFile();
                        if (parentFile2 == null || !parentFile2.canWrite()) {
                            return com.alibaba.alibity.container.file.b.INSTANCE.f("指定目标文件路径没有写权限 " + str2);
                        }
                    }
                    if (file.length() > FileAbility.MAX_DIR_SIZE) {
                        return com.alibaba.alibity.container.file.b.INSTANCE.k("单个文件超限");
                    }
                    Long valueOf = str3 != null ? Long.valueOf(d.b(new File(str3))) : null;
                    if (valueOf != null && valueOf.longValue() + file.length() > 104857600) {
                        return com.alibaba.alibity.container.file.b.INSTANCE.k("文件夹超限");
                    }
                    try {
                        Result.a aVar = Result.Companion;
                        a2 = n.Companion.a(file.getPath());
                        q.b(a2, "(ZipFileInfo.Companion).parse(srcFile.path)");
                    } catch (Throwable th) {
                        Result.a aVar2 = Result.Companion;
                        m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
                    }
                    if (!a2.a()) {
                        return com.alibaba.ability.result.a$a.Companion.b("源文件不是zip类型");
                    }
                    if (a2.d()) {
                        return com.alibaba.ability.result.a$a.Companion.b("file path contains relative parent path");
                    }
                    if (a2.c() <= FileAbility.MAX_DIR_SIZE && a2.b() <= FileAbility.MAX_DIR_SIZE) {
                        if (valueOf == null) {
                            tVar = null;
                        } else if (valueOf.longValue() + a2.b() > 104857600) {
                            return com.alibaba.alibity.container.file.b.INSTANCE.k("文件夹超限");
                        } else {
                            tVar = t.INSTANCE;
                        }
                        m2371constructorimpl = Result.m2371constructorimpl(tVar);
                        if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
                            return new ErrorResult(String.valueOf(499), "未知错误: " + m2374exceptionOrNullimpl.getMessage(), (Map) null, 4, (o) null);
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = (ZipInputStream) 0;
                        byte[] a3 = h.INSTANCE.a(2048);
                        q.b(a3, "IOUtils.INSTANCE.getBuf(2048)");
                        if (!kotlin.text.n.c(str2, "/", false, 2, (Object) null)) {
                            str4 = str2 + fxb.DIR;
                        } else {
                            str4 = str2;
                        }
                        try {
                            objectRef.element = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
                            Iterator a4 = kotlin.sequences.g.a(new FileAbility$unzip$4(objectRef)).a();
                            while (a4.hasNext()) {
                                ZipEntry zipEntry = (ZipEntry) a4.next();
                                String name = zipEntry.getName();
                                q.b(name, "zipEntry.name");
                                if (!TextUtils.isEmpty(name) && !kotlin.text.n.b(name, "../", false, 2, (Object) null) && !kotlin.text.n.c(name, "/..", false, 2, (Object) null) && !kotlin.text.n.b((CharSequence) name, (CharSequence) "/../", false, 2, (Object) null)) {
                                    File file3 = new File(str4 + name);
                                    if (zipEntry.isDirectory()) {
                                        file3.mkdirs();
                                    } else {
                                        File parentFile3 = file3.getParentFile();
                                        if (parentFile3 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                                        }
                                        if (!parentFile3.exists()) {
                                            parentFile3.mkdirs();
                                        }
                                        FileOutputStream fileOutputStream2 = null;
                                        try {
                                            fileOutputStream = new FileOutputStream(file3);
                                            while (true) {
                                                try {
                                                    int read = ((ZipInputStream) objectRef.element).read(a3);
                                                    if (read <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(a3, 0, read);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    h.INSTANCE.a(fileOutputStream);
                                                    throw th;
                                                }
                                            }
                                            h.INSTANCE.a(fileOutputStream);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                    }
                                }
                            }
                            return new FinishResult(null, "success", 1, null);
                        } catch (Throwable th4) {
                            try {
                                th4.printStackTrace();
                                return new ErrorResult(String.valueOf(499), "未知错误: " + th4.getMessage(), (Map) null, 4, (o) null);
                            } finally {
                                h.INSTANCE.a(a3);
                                h.INSTANCE.a((Closeable) ((ZipInputStream) objectRef.element));
                            }
                        }
                    }
                    return com.alibaba.alibity.container.file.b.INSTANCE.k("单个文件超限");
                }
            }
        }
        return com.alibaba.ability.result.a$a.Companion.b("file path is empty");
    }
}
