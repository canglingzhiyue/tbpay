package android.taobao.windvane.extra.uc.interfaces;

import java.util.Map;

/* loaded from: classes2.dex */
public interface IRequest {
    void cancel();

    EventHandler getEventHandler();

    Map<String, String> getHeaders();

    String getMethod();

    Map<String, byte[]> getUploadDataMap();

    Map<String, String> getUploadFileMap();

    long getUploadFileTotalLen();

    String getUrl();

    void setEventHandler(EventHandler eventHandler);
}
