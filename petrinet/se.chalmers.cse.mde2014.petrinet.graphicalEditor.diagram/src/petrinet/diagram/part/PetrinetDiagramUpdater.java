package petrinet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import petrinet.Arc;
import petrinet.Node;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Token;
import petrinet.Transition;
import petrinet.diagram.edit.parts.ArcEditPart;
import petrinet.diagram.edit.parts.PetriNetEditPart;
import petrinet.diagram.edit.parts.PlaceEditPart;
import petrinet.diagram.edit.parts.PlaceTokenCompartmentEditPart;
import petrinet.diagram.edit.parts.TokenEditPart;
import petrinet.diagram.edit.parts.TransitionEditPart;
import petrinet.diagram.providers.PetrinetElementTypes;

/**
 * @generated
 */
public class PetrinetDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PetrinetNodeDescriptor> getSemanticChildren(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000SemanticChildren(view);
		case PlaceTokenCompartmentEditPart.VISUAL_ID:
			return getPlaceTokenCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetNodeDescriptor> getPetriNet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PetriNet modelElement = (PetriNet) view.getElement();
		LinkedList<PetrinetNodeDescriptor> result = new LinkedList<PetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = PetrinetVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetNodeDescriptor> getPlaceTokenCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Place modelElement = (Place) containerView.getElement();
		LinkedList<PetrinetNodeDescriptor> result = new LinkedList<PetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTokens().iterator(); it.hasNext();) {
			Token childElement = (Token) it.next();
			int visualID = PetrinetVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TokenEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getContainedLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001ContainedLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getIncomingLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001IncomingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getOutgoingLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001OutgoingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPetriNet_1000ContainedLinks(
			View view) {
		PetriNet modelElement = (PetriNet) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2002IncomingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2001IncomingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2002OutgoingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2001OutgoingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PetrinetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			PetriNet container) {
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new PetrinetLinkDescriptor(src, dst, link,
					PetrinetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PetrinetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PetrinetPackage.eINSTANCE
					.getArc_Target()
					|| false == setting.getEObject() instanceof Arc) {
				continue;
			}
			Arc link = (Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new PetrinetLinkDescriptor(src, target, link,
					PetrinetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PetrinetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			Node source) {
		PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof PetriNet) {
				container = (PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PetrinetLinkDescriptor(src, dst, link,
					PetrinetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<PetrinetNodeDescriptor> getSemanticChildren(View view) {
			return PetrinetDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PetrinetLinkDescriptor> getContainedLinks(View view) {
			return PetrinetDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PetrinetLinkDescriptor> getIncomingLinks(View view) {
			return PetrinetDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PetrinetLinkDescriptor> getOutgoingLinks(View view) {
			return PetrinetDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
