package mtopsdk.mtop.global.init;

import mtopsdk.mtop.global.MtopConfig;

/* loaded from: classes.dex */
public interface IMtopInitTask {
    void executeCoreTask(MtopConfig mtopConfig);

    void executeExtraTask(MtopConfig mtopConfig);
}
