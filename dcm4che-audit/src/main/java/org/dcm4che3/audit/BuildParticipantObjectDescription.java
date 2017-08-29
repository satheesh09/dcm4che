/*
 * *** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at https://github.com/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * J4Care.
 * Portions created by the Initial Developer are Copyright (C) 2017
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See @authors listed below
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * *** END LICENSE BLOCK *****
 */

package org.dcm4che3.audit;


/**
 * @author Vrinda Nayak <vrinda.nayak@j4care.com>
 * @since June 2016
 */

public class BuildParticipantObjectDescription {
    public final Accession[] acc;
    public final MPPS[] mpps;
    public final SOPClass[] sopC;
    public final Boolean encrypted;
    public final Boolean anonymized;
    public final ParticipantObjectContainsStudy pocs;

    public static class Builder {
        private Boolean encrypted;
        private Boolean anonymized;
        private ParticipantObjectContainsStudy pocs;
        private Accession[] acc = {};
        private MPPS[] mpps = {};
        private SOPClass[] sopC = {};

        public Builder acc(Accession... val) {
            acc = val;
            return this;
        }

        public Builder mpps(MPPS... val) {
            mpps = val;
            return this;
        }

        public Builder sopC(SOPClass... val) {
            sopC = val;
            return this;
        }

        public Builder encrypted(Boolean val) {
            encrypted = val;
            return this;
        }

        Builder anonymized(Boolean val) {
            anonymized = val;
            return this;
        }

        public BuildParticipantObjectDescription build() {
            return new BuildParticipantObjectDescription(this);
        }
    }

    private BuildParticipantObjectDescription(Builder builder) {
        encrypted = builder.encrypted;
        anonymized = builder.anonymized;
        pocs = builder.pocs;
        acc = builder.acc;
        mpps = builder.mpps;
        sopC = builder.sopC;
    }
}
