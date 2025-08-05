package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechResProtocol;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SpeechRecognizerResponse extends SpeechResProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1056190928);
    }

    public String getRecognizedText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b1f0bc0", new Object[]{this}) : (String) this.payload.get("result");
    }

    public String getTaskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54ada043", new Object[]{this}) : (String) this.header.get("task_id");
    }
}
