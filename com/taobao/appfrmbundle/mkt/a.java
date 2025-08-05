package com.taobao.appfrmbundle.mkt;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.util.Map;
import tb.olv;
import tb.omf;
import tb.omg;

/* loaded from: classes6.dex */
public class a implements olv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.olv
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3702b6b0", new Object[]{this, command});
        }
        if (command.header.c == 1000) {
            MsgLog.a("MonitorCmdProcessor", "start to upload monitor");
            l.a().uploadAsync(new i() { // from class: com.taobao.appfrmbundle.mkt.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.i
                public String getBizType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : "msg-monitor";
                }

                @Override // com.uploader.export.i
                public String getFileType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this}) : ".db";
                }

                @Override // com.uploader.export.i
                public Map<String, String> getMetaInfo() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.uploader.export.i
                public String getFilePath() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : omg.d.getDatabasePath(omf.DAO_NAME).getAbsolutePath();
                }
            }, new d() { // from class: com.taobao.appfrmbundle.mkt.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.d
                public void onCancel(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onPause(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88a48f02", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onProgress(i iVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                    }
                }

                @Override // com.uploader.export.d
                public void onResume(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onStart(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onWait(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1be90445", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onSuccess(i iVar, e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                    } else {
                        MsgLog.a("MonitorCmdProcessor", "uploaded monitor");
                    }
                }

                @Override // com.uploader.export.d
                public void onFailure(i iVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                    } else {
                        MsgLog.a("MonitorCmdProcessor", "fail to upload monitor");
                    }
                }
            }, null);
        }
        return null;
    }
}
