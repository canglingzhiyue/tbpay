package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;

/* loaded from: classes2.dex */
public interface RVAccountService extends Proxiable {
    String getNick(Node node);

    String getUserAvatar(Node node);

    String getUserId(Node node);

    boolean isLogin(Node node);
}
