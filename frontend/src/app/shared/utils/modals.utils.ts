import { InformationModalComponent } from '../components/information-modal/information-modal.component';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

export function openInformationModal(modalService: NgbModal, infoMessage: string) {
  const informationModalRef = modalService.open( InformationModalComponent );
  informationModalRef.componentInstance.information = infoMessage;
}
