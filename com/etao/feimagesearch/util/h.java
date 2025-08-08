package com.etao.feimagesearch.util;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.acg;
import tb.com;
import tb.cot;
import tb.cuf;
import tb.kge;
import tb.rpb;
import tb.rpc;

/* loaded from: classes4.dex */
public class h extends cuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_TFS_KEY = "tfsKey";
    public static final String KEY_UPLOAD_URL = "url";
    public static final String KEY_VIDEO_ID = "videoID";
    private Map<String, com.uploader.export.i> b;
    private com.uploader.export.g c;

    static {
        kge.a(718916424);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3719567", new Object[]{hVar, str}) : hVar.a(str);
    }

    public static /* synthetic */ Map a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("544a0444", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ String b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a8645b2", new Object[]{hVar}) : hVar.f26537a;
    }

    public h(String str) {
        super(str);
        this.b = new HashMap();
        this.c = com.uploader.export.l.a();
        if (!this.c.isInitialized()) {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.initialize(acg.a(), new rpb(acg.a(), new rpc(acg.a()) { // from class: com.etao.feimagesearch.util.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public int getEnvironment() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
                    }
                    int i = com.i();
                    if (i == 0) {
                        return 0;
                    }
                    if (i == 1) {
                        return 1;
                    }
                    return i != 2 ? 0 : 2;
                }

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public String getAppVersion() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("65f009ac", new Object[]{this}) : com.g();
                }

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public String getAppKey() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("49079005", new Object[]{this}) : com.d();
                }
            }));
        }
    }

    public void a(String str, final Handler handler, final String str2, final HashMap<String, String> hashMap) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e75f687", new Object[]{this, str, handler, str2, hashMap});
        } else if (StringUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
        } else {
            final String path = parse.getPath();
            com.uploader.export.i iVar = new com.uploader.export.i() { // from class: com.etao.feimagesearch.util.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.i
                public Map<String, String> getMetaInfo() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.uploader.export.i
                public String getBizType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : h.b(h.this);
                }

                @Override // com.uploader.export.i
                public String getFilePath() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : path;
                }

                @Override // com.uploader.export.i
                public String getFileType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this}) : str2;
                }
            };
            this.b.put(path, iVar);
            this.c.uploadAsync(iVar, new com.uploader.export.d() { // from class: com.etao.feimagesearch.util.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.d
                public void onCancel(com.uploader.export.i iVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("227e67e0", new Object[]{this, iVar2});
                    }
                }

                @Override // com.uploader.export.d
                public void onPause(com.uploader.export.i iVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88a48f02", new Object[]{this, iVar2});
                    }
                }

                @Override // com.uploader.export.d
                public void onResume(com.uploader.export.i iVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc5b564d", new Object[]{this, iVar2});
                    }
                }

                @Override // com.uploader.export.d
                public void onWait(com.uploader.export.i iVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1be90445", new Object[]{this, iVar2});
                    }
                }

                @Override // com.uploader.export.d
                public void onStart(com.uploader.export.i iVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93ee4d16", new Object[]{this, iVar2});
                    } else {
                        cot.a("AutoDetect", "FileUploader", "onStart");
                    }
                }

                @Override // com.uploader.export.d
                public void onSuccess(com.uploader.export.i iVar2, com.uploader.export.e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar2, eVar});
                        return;
                    }
                    cot.a("AutoDetect", "FileUploader", "onSuccess task.bizType " + iVar2.getBizType() + ", result " + JSON.toJSONString(eVar));
                    HashMap hashMap2 = new HashMap(5);
                    String a2 = h.a(h.this, eVar.b());
                    HashMap hashMap3 = hashMap;
                    if (hashMap3 != null && !hashMap3.isEmpty()) {
                        hashMap2.putAll(hashMap);
                        if (!StringUtils.isEmpty(a2)) {
                            hashMap2.put("tfskey", a2);
                        }
                    }
                    hashMap2.put("url", eVar.b());
                    Handler handler2 = handler;
                    if (handler2 != null) {
                        Message obtainMessage = handler2.obtainMessage();
                        obtainMessage.what = 30000;
                        obtainMessage.obj = hashMap2;
                        handler.sendMessage(obtainMessage);
                    }
                    h.a(h.this).remove(path);
                }

                @Override // com.uploader.export.d
                public void onFailure(com.uploader.export.i iVar2, com.uploader.export.j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar2, jVar});
                        return;
                    }
                    cot.a("AutoDetect", "FileUploader", String.format("errcode:%s,subcode:%s,errMsg:%s", jVar.f24058a, jVar.b, jVar.c));
                    Handler handler2 = handler;
                    if (handler2 != null) {
                        Message obtainMessage = handler2.obtainMessage();
                        obtainMessage.what = 30001;
                        HashMap hashMap2 = new HashMap(10);
                        hashMap2.put("errorCode", jVar.b);
                        HashMap hashMap3 = hashMap;
                        if (hashMap3 != null && !hashMap3.isEmpty()) {
                            hashMap2.putAll(hashMap);
                        }
                        obtainMessage.obj = hashMap2;
                        handler.sendMessage(obtainMessage);
                    }
                    h.a(h.this).remove(path);
                }

                @Override // com.uploader.export.d
                public void onProgress(com.uploader.export.i iVar2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43b04c96", new Object[]{this, iVar2, new Integer(i)});
                        return;
                    }
                    Handler handler2 = handler;
                    if (handler2 == null) {
                        return;
                    }
                    Message obtainMessage = handler2.obtainMessage();
                    obtainMessage.what = cuf.MSG_FILE_UPLOAD_PROGRESS;
                    obtainMessage.obj = Integer.valueOf(i);
                    handler.sendMessage(obtainMessage);
                }
            }, null);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }
}
