package com.taobao.umipublish.extension.windvane.abilities;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.aw;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.bean.AudioBean;
import java.util.List;
import java.util.Map;
import tb.fjp;
import tb.gww;
import tb.kge;

/* loaded from: classes9.dex */
public class QuickGoPreviewPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LITE_EDITOR_PREVIEW = "lite_editor_preview";
    public static final String KEY_RESULT = "result";
    public static final String KEY_STATE = "state";
    public static final String PREVIEW_ERROR_CODE = "6011";
    private static final String QUICK_PREVIEW_PATH = "https://h5.m.taobao.com/lc/entry/quick_preview.html";
    private static final String TAG = "QuickGoPreviewPageAbility";
    public static final String VALUE_STATE_NORMAL_EXIT = "normal_exit";
    public static final String VALUE_STATE_PUBLISH_EXIT = "publish_exit";

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f23343a;

    static {
        kge.a(338044746);
    }

    public static /* synthetic */ Object ipc$super(QuickGoPreviewPageAbility quickGoPreviewPageAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else {
            c(jSONObject);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else {
            b(jSONObject);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback(PREVIEW_ERROR_CODE, "params is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("template_data");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("draft");
            String string = jSONObject3 != null ? jSONObject3.getString("path") : null;
            if (string == null) {
                errorCallback(PREVIEW_ERROR_CODE, "draftPath is null");
                return;
            }
            String string2 = jSONObject2.getString(fjp.SCENE_MEDIA_PLAYER);
            if (string2 == null) {
                errorCallback(PREVIEW_ERROR_CODE, "mediaInfo is null");
                return;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("publish_data");
            boolean k = e.k(this.mContext);
            List parseArray = JSONObject.parseArray(string2, MultiVideoClips.MediaResource.class);
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            editorInfo.resource.originData = new MultiVideoClips(parseArray);
            editorInfo.resource.draftPath = string;
            editorInfo.resource.type = Resource.TYPE_TEMPLATE_LITE;
            UGCVideo uGCVideo = new UGCVideo();
            uGCVideo.editorInfo = editorInfo;
            uGCVideo.setMeta("SourceFrom", "AlbumEffect");
            a(jSONObject4, uGCVideo);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("publish_data", (Object) jSONObject4);
            jSONObject5.put("template_data", (Object) jSONObject2);
            d(jSONObject4);
            JSONObject jSONObject6 = jSONObject.getJSONObject("publish_params");
            if (k) {
                IUGCMedia d = e.d(this.mContext);
                if (d == null) {
                    errorCallback(PREVIEW_ERROR_CODE, "ugcMedia null");
                    return;
                }
                d.resetMedia();
                d.getVideos().add(uGCVideo);
                d.setMeta("preview_data", jSONObject5);
                d.setMeta("publish_params", jSONObject6);
                progressCallback(100);
                Nav.from(this.mContext).toUri(gww.a(e.b(d)).b("VIDEO_EDIT_PATH"));
            } else {
                progressCallback(100);
                if (!a(QUICK_PREVIEW_PATH, jSONObject5, jSONObject6, uGCVideo)) {
                    errorCallback(PREVIEW_ERROR_CODE, "preview nav fail");
                    return;
                }
            }
            a();
        }
    }

    private static void a(JSONObject jSONObject, UGCVideo uGCVideo) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7af1844", new Object[]{jSONObject, uGCVideo});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(AbilityConst.Server.f23328a);
        if (jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray(AbilityConst.Server.b)) == null || jSONArray.size() == 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return;
        }
        String a2 = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "musicId");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        AudioBean audioBean = new AudioBean();
        audioBean.id = a2;
        audioBean.pieceAudioId = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "audioId");
        audioBean.vender_type = m.a((String) null, jSONObject2, aw.PARAM_EXTEND, "videoConfig", "musicVendor");
        uGCVideo.setMeta("music_bean_preview", JSON.toJSONString(audioBean));
    }

    private boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2, UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8b891de", new Object[]{this, str, jSONObject, jSONObject2, uGCVideo})).booleanValue();
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        if (!(this.mContext instanceof FragmentActivity)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("preview_data", jSONObject);
        bundle.putSerializable("preview_ugc_video", uGCVideo);
        bundle.putSerializable("publish_params", jSONObject2);
        Nav.from(this.mContext).withExtras(bundle).toUri(buildUpon.build());
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f23343a = new BroadcastReceiver() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onReceive(android.content.Context r4, android.content.Intent r5) {
                /*
                    r3 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L18
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r3
                    r2 = 1
                    r1[r2] = r4
                    r4 = 2
                    r1[r4] = r5
                    java.lang.String r4 = "3c04d85a"
                    r0.ipc$dispatch(r4, r1)
                    return
                L18:
                    com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
                    r4.<init>()
                    if (r5 != 0) goto L23
                L1f:
                    com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.a(r4)
                    goto L4f
                L23:
                    java.lang.String r0 = "result"
                    java.io.Serializable r1 = r5.getSerializableExtra(r0)
                    if (r1 == 0) goto L43
                    java.io.Serializable r0 = r5.getSerializableExtra(r0)
                    com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
                    java.lang.String r1 = "contentId"
                    if (r0 == 0) goto L43
                    boolean r2 = r0.containsKey(r1)
                    if (r2 == 0) goto L43
                    java.lang.String r0 = r0.getString(r1)
                    r4.put(r1, r0)
                L43:
                    java.lang.String r0 = "state"
                    java.lang.String r5 = r5.getStringExtra(r0)
                    if (r5 == 0) goto L1f
                    r4.put(r0, r5)
                L4f:
                    com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility r5 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.this
                    android.content.Context r5 = r5.mContext
                    android.support.v4.content.LocalBroadcastManager r5 = android.support.v4.content.LocalBroadcastManager.getInstance(r5)
                    r5.unregisterReceiver(r3)
                    com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility r5 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.this
                    r5.successCallback(r4)
                    com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility r4 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.this
                    android.content.Context r4 = r4.mContext
                    com.taobao.android.litecreator.base.data.IUGCMedia r4 = com.taobao.android.litecreator.base.workflow.e.d(r4)
                    if (r4 == 0) goto L6c
                    r4.resetMedia()
                L6c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.f23343a, new IntentFilter(ACTION_LITE_EDITOR_PREVIEW));
    }

    private static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{jSONObject});
        } else {
            jSONObject.put("state", VALUE_STATE_NORMAL_EXIT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.alibaba.fastjson.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r0 = "rawText"
            java.lang.String r1 = "literalText"
            java.lang.String r2 = "textTpl"
            java.lang.String r3 = "recMaterialTool"
            java.lang.String r4 = ""
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L22
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r11
            r0[r7] = r12
            java.lang.String r12 = "265ed165"
            r5.ipc$dispatch(r12, r0)
            return
        L22:
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L44
            com.alibaba.fastjson.JSONObject r6 = com.taobao.android.litecreator.util.m.b(r12, r6)     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L41
            com.alibaba.fastjson.JSONObject r5 = r6.getJSONObject(r2)     // Catch: java.lang.Exception -> L3e
            if (r5 == 0) goto L41
            java.lang.String r9 = r5.getString(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r7 = r5.getString(r0)     // Catch: java.lang.Exception -> L3c
            goto L55
        L3c:
            r10 = move-exception
            goto L47
        L3e:
            r10 = move-exception
            r9 = r4
            goto L47
        L41:
            r7 = r4
            r9 = r7
            goto L55
        L44:
            r10 = move-exception
            r9 = r4
            r6 = r5
        L47:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r10 = r10.getMessage()
            r7[r8] = r10
            java.lang.String r10 = "QuickGoPreviewPageAbility"
            com.taobao.android.litecreator.util.u.d(r10, r7)
            r7 = r4
        L55:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L7e
            java.lang.String r10 = "materialTool"
            java.lang.String[] r3 = new java.lang.String[]{r3, r10}
            com.alibaba.fastjson.JSONArray r12 = com.taobao.android.litecreator.util.m.a(r12, r3)
            if (r12 == 0) goto L7e
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L7e
            com.alibaba.fastjson.JSONObject r12 = r12.getJSONObject(r8)
            java.lang.String r3 = "extend"
            java.lang.String r8 = "recommendedText"
            java.lang.String[] r3 = new java.lang.String[]{r3, r8}
            java.lang.String r4 = com.taobao.android.litecreator.util.m.a(r4, r12, r3)
        L7e:
            if (r5 != 0) goto L8a
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            if (r6 == 0) goto L8a
            r6.put(r2, r5)
        L8a:
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto L99
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 == 0) goto L99
            r5.put(r1, r4)
        L99:
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto La8
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 == 0) goto La8
            r5.put(r0, r4)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.windvane.abilities.QuickGoPreviewPageAbility.d(com.alibaba.fastjson.JSONObject):void");
    }
}
