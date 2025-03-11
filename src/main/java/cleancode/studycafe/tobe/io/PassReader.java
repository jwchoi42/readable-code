package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPasses;

public interface PassReader {

    StudyCafeLockerPasses readStudyCafePasses();

    cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPasses readLockerPasses();
}
