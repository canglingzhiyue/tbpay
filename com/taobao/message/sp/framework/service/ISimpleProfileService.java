package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\tH&J2\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\tH&¨\u0006\r"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleProfileService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "listProfiles", "", "targetIds", "", "", "bizType", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "listProfilesByNick", "targetNicks", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface ISimpleProfileService extends ISimpleDataService {
    void listProfiles(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver);

    void listProfilesByNick(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver);
}
