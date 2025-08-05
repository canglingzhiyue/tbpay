package com.taobao.android.litecreator.comprehension.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class RecognizeVideoMusicMTopRequest implements IMTOPDataObject {
    public String audioPart;
    public String sessionId;
    public String ugcScene;
    private String API_NAME = "mtop.taobao.media.guang.music.recognizeVideoMusic";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-1890370745);
        kge.a(-350052935);
    }

    public RecognizeVideoMusicMTopRequest(String str, String str2, String str3) {
        this.ugcScene = str;
        this.sessionId = str2;
        this.audioPart = str3;
    }

    public String getUgcScene() {
        return this.ugcScene;
    }

    public void setUgcScene(String str) {
        this.ugcScene = str;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getAudioPart() {
        return this.audioPart;
    }

    public void setAudioPart(String str) {
        this.audioPart = str;
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }
}
