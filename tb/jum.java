package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;

/* loaded from: classes5.dex */
public class jum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(502410850);
    }

    public static JSONObject a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("11edcaba", new Object[]{fluidContext});
        }
        JSONObject parseObject = JSONObject.parseObject("{\"pageMap\": \"\", \"extraMap\": \"\", \"id\": \"\", \"type\": \"\", \"hasExposed\": \"\", \"index\": \"\", \"modelIndex\": \"\", \"relativeIndex\": \"\", \"sequenceNumber\": \"\", \"updateDataMsgForGlobalH5\": \"\", \"utPairs\": \"\", \n\"content\": {\"id\": \"\", \"status\": \"\", \"summary\": \"\", \"title\": \"\", \"interactiveId\": \"\", \"elements\": {\"duration\": \"\", \"firstFrameUrl\": \"\", \"height\": \"\", \"type\": \"\", \"url\": \"\", \"videoId\": \"\", \"width\": \"\"}},\n\"raw\": {\"account\": \"\", \"content\": \"\", \"sequenceNumber\": \"\", \"sequenceNumberStr\": \"\", \"nid\": \"\", \"subType\": \"\", \"type\": \"\", \"bginteractive\": \"\", \"playletInfo\": \"\", \"utPairs\": \"\", \"extraData\": \"\",\"frontendTransmission\": \"\"}}");
        try {
            JSONObject parseObject2 = JSONObject.parseObject(oeb.a("ShortVideo.activeCardDataMessageFields", "{\"pageMap\": \"\", \"extraMap\": \"\", \"id\": \"\", \"type\": \"\", \"hasExposed\": \"\", \"index\": \"\", \"modelIndex\": \"\", \"relativeIndex\": \"\", \"sequenceNumber\": \"\", \"updateDataMsgForGlobalH5\": \"\", \"utPairs\": \"\", \n\"content\": {\"id\": \"\", \"status\": \"\", \"summary\": \"\", \"title\": \"\", \"interactiveId\": \"\", \"elements\": {\"duration\": \"\", \"firstFrameUrl\": \"\", \"height\": \"\", \"type\": \"\", \"url\": \"\", \"videoId\": \"\", \"width\": \"\"}},\n\"raw\": {\"account\": \"\", \"content\": \"\", \"sequenceNumber\": \"\", \"sequenceNumberStr\": \"\", \"nid\": \"\", \"subType\": \"\", \"type\": \"\", \"bginteractive\": \"\", \"playletInfo\": \"\", \"utPairs\": \"\", \"extraData\": \"\",\"frontendTransmission\": \"\"}}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            FluidException.throwException(fluidContext, IMessageService.ERROR_CODE_GET_CARD_DATA_MESSAGE_FIELDS_THROWABLE, "获取当前活动卡片数据相关消息的参数字段异常", th);
            return parseObject;
        }
    }
}
